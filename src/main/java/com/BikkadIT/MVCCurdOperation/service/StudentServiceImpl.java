package com.BikkadIT.MVCCurdOperation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BikkadIT.MVCCurdOperation.model.Student;
import com.BikkadIT.MVCCurdOperation.repository.StudentRepo;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepo studentRepo;
	@Override
	public Student createStudent(Student stu) {
		Student savestudent = studentRepo.save(stu);
		
		return savestudent;
	}

}
