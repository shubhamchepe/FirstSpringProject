package com.firstspringproject.firstspringproject.services;

import java.util.List;

import com.firstspringproject.firstspringproject.entities.Course;

public interface CourseService {

	public List<Course> getCourses();
	public Course getCourse(long courseId);
	public Course addCourse(Course course);
}
