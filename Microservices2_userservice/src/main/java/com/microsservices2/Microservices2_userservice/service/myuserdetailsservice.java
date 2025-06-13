package com.microsservices2.Microservices2_userservice.service;
import com.microsservices2.Microservices2_userservice.model.myuserdetails;
import com.microsservices2.Microservices2_userservice.model.usermodelfornotesapp;
import com.microsservices2.Microservices2_userservice.repo.userrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class myuserdetailsservice implements UserDetailsService {
    @Autowired
    userrepo ur;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        usermodelfornotesapp user=ur.findbyusername(username);
        if (user==null){
            System.out.println("no user found");
            throw new UsernameNotFoundException("no user found with that username");
        }
        return new myuserdetails(user);
    }
}
