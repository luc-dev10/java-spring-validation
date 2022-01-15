package com.spring.validation.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("student")
public class StudentController {

	@RequestMapping("form")
	public String getForm() {
		return "student-form";
	}

}
