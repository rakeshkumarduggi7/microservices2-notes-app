package com.microsservices2.Microservices2_notesservice.service;

import com.microsservices2.Microservices2_notesservice.model.notesmodel;
import com.microsservices2.Microservices2_notesservice.repo.notesrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class notesservice {
    @Autowired
    notesrepo nrepo;

    public List<notesmodel> getall(String un) {
return nrepo.getall(un);
    }

    public List<notesmodel> addnotes(String un, notesmodel notes) {
        notes.setDate(LocalDateTime.now());
        notes.setUsername(un);
        nrepo.save(notes);
        return nrepo.getall(un);
    }
}
