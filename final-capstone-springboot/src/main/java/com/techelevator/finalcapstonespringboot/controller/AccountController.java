package com.techelevator.finalcapstonespringboot.controller;

import com.techelevator.finalcapstonespringboot.authentication.AuthProvider;
import com.techelevator.finalcapstonespringboot.authentication.JwtTokenHandler;
import com.techelevator.finalcapstonespringboot.authentication.UnauthorizedException;
import com.techelevator.finalcapstonespringboot.authentication.UserCreationException;
import com.techelevator.finalcapstonespringboot.model.User;
import com.techelevator.finalcapstonespringboot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

/**
 * AccountController
 */
@RestController
public class AccountController {
    @Autowired
    UserRepository userRep;
    
    @Autowired
    private AuthProvider auth;
    
    @Autowired
    private JwtTokenHandler tokenHandler;
    
    @RequestMapping(path = "/login", method = RequestMethod.POST)
    public String login(@RequestBody User user, RedirectAttributes flash) throws UnauthorizedException {
        if (auth.signIn(user)) {
            User currentUser = auth.getCurrentUser();
            return tokenHandler.createToken(user.getUsername(), currentUser.getRole());
        } else {
            throw new UnauthorizedException();
        }
    }
    
    @RequestMapping(path = "/register", method = RequestMethod.POST)
    public String register(@Valid @RequestBody User user, BindingResult result) throws UserCreationException {
        if (result.hasErrors()) {
            String errorMessages = "";
            for (ObjectError error : result.getAllErrors()) {
                errorMessages += error.getDefaultMessage() + "\n";
            }
            throw new UserCreationException(errorMessages);
        }
        auth.register(user);
        return "{\"success\":true}";
    }
    
}

