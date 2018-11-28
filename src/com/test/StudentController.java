package com.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class StudentController {
	
	@GetMapping("/student")
	
	public ModelAndView student() {
		
		return new ModelAndView("student","command", new Student());
		
	}

	
	@PostMapping ("/addStudent")
		public String addStudent(@ModelAttribute("SpringWeb") Student student.
				ModelMap model) {
		
	}
}
