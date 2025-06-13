package com.microsservices2.Microservices2_userservice.controller;
import com.microsservices2.Microservices2_userservice.model.notesmodel;
import com.microsservices2.Microservices2_userservice.model.usermodelfornotesapp;
import com.microsservices2.Microservices2_userservice.service.userservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class usercontroller {
    @Autowired
    userservice us;

    @GetMapping("")
    public String welcome(){
        return "youve logged in successfully";
    }
    @PostMapping("/signup")
    public String signup(@RequestBody usermodelfornotesapp user){
      return us.signup(user);
    }

@GetMapping("/getallnotes")
    public List<notesmodel> getall(){
      return   us.getall();
}
@PostMapping("/addnotes")
    public List<notesmodel> addnotes(@RequestBody notesmodel notes){
        return us.addnotes(notes);
}

}
