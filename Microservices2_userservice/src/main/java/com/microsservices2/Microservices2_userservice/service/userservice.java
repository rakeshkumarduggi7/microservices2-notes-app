package com.microsservices2.Microservices2_userservice.service;

import com.microsservices2.Microservices2_userservice.feign.notesfeign;
import com.microsservices2.Microservices2_userservice.model.notesmodel;
import com.microsservices2.Microservices2_userservice.model.usermodelfornotesapp;
import com.microsservices2.Microservices2_userservice.repo.userrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class userservice {
    BCryptPasswordEncoder encoder=new BCryptPasswordEncoder(12);
    @Autowired
    userrepo ur;

    @Autowired
    notesfeign feign;
    public String signup(usermodelfornotesapp user){
        if (ur.findbyusername(user.getUsername())==null){
            user.setPassword(encoder.encode(user.getPassword()));
            ur.save(user);
            return "successfully saved";
        }
        return "username already exists try another";
    }


    public List<notesmodel> getall() {
        return feign.getnotes();
    }

    public List<notesmodel> addnotes(notesmodel notes) {
        return feign.addnotes(notes);
    }
}
