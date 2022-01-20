package com.spring.validation.Model;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.spring.validation.annotation.CourseCode;

public class Student {

	@CourseCode
	private String courseCode;

	@NotNull(message = "is required")
	@Size(min = 1, message = "is required")
	private String firstName;

	private String lastName;

	@NotNull(message = "is required")
	@Max(message = "max is 100", value = 100)
	@Min(message = "min is 0", value = 0)
	private Integer age;

	@Pattern(regexp = "^[a-zA-Z0-9]{5}", message = "invalid postal")
	private String postalCode;

	public String getPostalCode() {
		return postalCode;
	}

	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

}
