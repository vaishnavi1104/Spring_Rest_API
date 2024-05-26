package com.springbootrest.springrest.services;

import java.util.List;

import com.springbootrest.springrest.entities.Course;

public interface CourseService {
//	for all courses
	public List<Course> getCourses();
	
//	for single course
	public Course getCourse(long courseId);

	public Course addCourse(Course course);

	public Course updateCourse(Course course, long courseId);
	
}
