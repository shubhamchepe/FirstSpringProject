package com.firstspringproject.firstspringproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.firstspringproject.firstspringproject.entities.Course;
import com.firstspringproject.firstspringproject.services.CourseService;

@RestController
public class MyController {
	
	@Autowired
	private CourseService courseService;

	@GetMapping("/home")
	public String home() {
		return "Hellow World!";
	}
	
	//get courses
	@GetMapping("/courses")
	public List<Course> getCourses(){
		return this.courseService.getCourses();
	}
	
	//get courses by ID
	@GetMapping("/courses/{courseId}")
	public Course getCourse(@PathVariable String courseId){
		return this.courseService.getCourse(Long.parseLong(courseId));
	}
	
	@PostMapping("/courses")
	public Course addCourse(@RequestBody Course course) {
		return this.courseService.addCourse(course);
	}
}
