package com.microsservices2.Microservices2_notesservice.repo;

import com.microsservices2.Microservices2_notesservice.model.notesmodel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface notesrepo extends JpaRepository<notesmodel,Integer> {

    @Query(value = "select * from notesmodel where username=:un order by date",nativeQuery = true)
    public List<notesmodel> getall(@Param("un")String un);
}
