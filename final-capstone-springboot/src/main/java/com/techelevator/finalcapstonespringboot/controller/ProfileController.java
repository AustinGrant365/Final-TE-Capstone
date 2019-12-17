package com.techelevator.finalcapstonespringboot.controller;


import com.techelevator.finalcapstonespringboot.repository.UserProfileRepository;
import com.techelevator.finalcapstonespringboot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class ProfileController {
    
    @Autowired
    UserRepository userRep;
    
    @Autowired
    UserProfileRepository userProfRep;
    
}
