package com.springbootrest.springrest.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springbootrest.springrest.entities.Course;
@Service
public class CourseServiceImpl implements CourseService {

//	we are storing data on temporary basis
	List<Course> list;
	
	public CourseServiceImpl() {
		list = new ArrayList<>();
		list.add(new Course(111,"Core Java Course", "THis course is for core Java. contains bassics of Java"));
		list.add(new Course(121, "Python Course","learn python with everybody"));
	}
	
	@Override
	public List<Course> getCourses() {
		
		return list;
	}

}
