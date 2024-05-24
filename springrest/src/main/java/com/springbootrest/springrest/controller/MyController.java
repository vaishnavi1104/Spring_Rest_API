package com.springbootrest.springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
}
