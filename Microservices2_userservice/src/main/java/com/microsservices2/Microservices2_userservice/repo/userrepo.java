package com.microsservices2.Microservices2_userservice.repo;

import com.microsservices2.Microservices2_userservice.model.usermodelfornotesapp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface userrepo extends JpaRepository<usermodelfornotesapp,Integer> {

    @Query(value = "select * from usermodelfornotesapp where username=:un",nativeQuery = true)
    usermodelfornotesapp findbyusername(@Param("un") String username);
}
