package com.techelevator.finalcapstonespringboot.controller;


import com.techelevator.finalcapstonespringboot.model.User;
import com.techelevator.finalcapstonespringboot.model.UserProfile;
import com.techelevator.finalcapstonespringboot.repository.UserProfileRepository;
import com.techelevator.finalcapstonespringboot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class UserProfileController {
    
    @Autowired
    UserRepository userRep;
    
    @Autowired
    UserProfileRepository userProfRep;
    
    @PostMapping(path = "/addprofile", produces = "application/json")
    public UserProfile addUserProfile(@RequestBody UserProfile userProfile) {
        System.out.println(userProfile.toString());
        System.out.println(userProfile.getUsername());
        UserProfile existingProfile = userProfRep.findByUsername(userProfile.getUsername());
        existingProfile.setAllFields(userProfile);
        if (existingProfile.getUser() == null)
            userProfile.setUser(userRep.findByUsername(userProfile.getUsername()));
        //Long userID = userRep.findByUsername(username).getId();
        //userProfile.setUserId(Long.valueOf(1201));
        return userProfRep.save(existingProfile);
    }
}
