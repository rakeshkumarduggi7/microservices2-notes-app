package com.microsservices2.Microservices2_userservice.feign;

import com.microsservices2.Microservices2_userservice.model.notesmodel;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient("ms2-notesservice")
public interface notesfeign {
    @GetMapping("/notes/getnotes")
    public List<notesmodel> getnotes();

    @PostMapping("/notes/addnotes")
    public List<notesmodel> addnotes(@RequestBody notesmodel notes);
}
