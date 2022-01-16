package com.spring.validation.Controller;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.validation.Model.Student;

@Controller
@RequestMapping("student")
public class StudentController {

	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {

		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);

		dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
	}

	@RequestMapping("/form")
	public String getForm(Model model) {

		Student student = new Student();
		model.addAttribute("student", student);
		return "student-form";
	}

	@RequestMapping("/processForm")
	public String processForm(@Valid @ModelAttribute("student") Student student, BindingResult bindingResult) {

		System.out.println(student.getFirstName());
		System.out.println(student.getFirstName());

		if (bindingResult.hasErrors())
			return "student-form";
		else
			return "student-details";

	}

}
