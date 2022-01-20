package com.spring.validation.annotation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode, String> {

	private String coursePrefix;

	@Override
	public void initialize(CourseCode courseCode) {
		coursePrefix = courseCode.value();
		ConstraintValidator.super.initialize(courseCode);
	}

	@Override
	public boolean isValid(String theCode, ConstraintValidatorContext context) {

		boolean result = theCode.startsWith(coursePrefix);
		if (result)
			return true;

		return false;
	}

}
