package com.springbootrest.springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springbootrest.springrest.entities.Course;
import com.springbootrest.springrest.services.CourseService;

@RestController
public class MyController {
		@Autowired
		private CourseService courseService;
		
		@GetMapping("/home")
		public String home() {
			return "Welcome to crud application using spring boot ";
		}
		
//		get the courses
		@GetMapping("/courses")
		public List<Course> getCourses(){
			return this.courseService.getCourses();
			
		}
		
//		to get a single id or course information
		@GetMapping("/courses/{courseId}")
		public Course getCourse(@PathVariable String courseId){
			return this.courseService.getCourse(Long.parseLong(courseId));
			
		}
		
//		to add course
		@PostMapping("/courses")
		public Course addCourse(@RequestBody Course course) {
			return this.courseService.addCourse(course);
			
		}
		
//		to update course 
		@PutMapping("/courses/{courseId}")
		public Course updateCourse(@RequestBody Course course,@PathVariable 
				("courseId") String courseId) {
			return this.courseService.updateCourse(course, Long.parseLong(courseId));
		}
}
