package com.microsservices2.Microservices2_notesservice.controller;

import com.microsservices2.Microservices2_notesservice.model.notesmodel;
import com.microsservices2.Microservices2_notesservice.service.notesservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/notes")
public class notescontroller {
@Autowired
    notesservice nservice;
    @GetMapping("/getnotes")
    public List<notesmodel> getnotes(@RequestHeader("usernameauth")String un){
        return nservice.getall(un);
    }
    @PostMapping("/addnotes")
    public List<notesmodel> addnotes(@RequestHeader("usernameauth")String un,@RequestBody notesmodel notes){
        return nservice.addnotes(un,notes);
    }

}
