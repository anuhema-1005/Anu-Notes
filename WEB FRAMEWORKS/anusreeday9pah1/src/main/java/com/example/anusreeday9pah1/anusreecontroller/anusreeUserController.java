package com.example.springapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springapp.model.anusreeUser;
import com.example.springapp.service.anusreeUserService;

@RestController
@RequestMapping("/api")
public class anusreeUserController {
    
    @Autowired
    private anusreeUserService userService;

    @PostMapping("/user")
    public ResponseEntity<anusreeUser> post(@RequestBody anusreeUser user)
    {
        if(userService.postUser(user))
        {
            return new ResponseEntity<anusreeUser>(user, HttpStatus.CREATED);
        }
        else{
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/user/{userId}")
    public ResponseEntity<anusreeUser> getById(@PathVariable int userId)
    {
        anusreeUser user = userService.getById(userId);
        if(user == null)
        {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        else{
            return new ResponseEntity<anusreeUser>(user, HttpStatus.OK);
        }
    }

    @GetMapping("/user/byName/{userName}")
    public ResponseEntity<anusreeUser> getByUserName(@PathVariable String userName)
    {
        anusreeUser user = userService.getByUserName(userName);
        if(user == null)
        {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        else{
            return new ResponseEntity<anusreeUser>(user, HttpStatus.OK);
        }
    }
}
