package com.BikkadIT.MVCCurdOperation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.BikkadIT.MVCCurdOperation.model.Student;

@Repository
public interface StudentRepo extends JpaRepository <Student, Integer>{

}
