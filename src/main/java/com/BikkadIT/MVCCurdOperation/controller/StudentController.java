package com.BikkadIT.MVCCurdOperation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.BikkadIT.MVCCurdOperation.model.Student;
import com.BikkadIT.MVCCurdOperation.service.StudentService;

@Controller
public class StudentController {

	@Autowired
	private StudentService studentService;

	@GetMapping("/welcomepage")
	public String preRegister() {
		
		return "reg";
			}
	
	@GetMapping("/studentData")
	public ModelAndView createStudent(Student stu) {
		System.out.println("Controller Layer Data" + stu);
		Student studentdata = studentService.createStudent(stu);
		ModelAndView mv = new ModelAndView();
		mv.addObject("STU", studentdata);
		mv.setViewName("stupg");
		return mv;
	}
	
}
