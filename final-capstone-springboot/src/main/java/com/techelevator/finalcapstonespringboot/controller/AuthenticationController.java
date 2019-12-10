package com.techelevator.finalcapstonespringboot.controller;

import com.techelevator.finalcapstonespringboot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthenticationController {
    @Autowired
    UserRepository userRep;
}
