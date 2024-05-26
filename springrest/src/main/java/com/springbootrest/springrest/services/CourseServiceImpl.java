package com.springbootrest.springrest.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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

//	to get course by their id. it returns course as per id given
	@Override
	public Course getCourse(long courseId) {
		Course c = null;
		for(Course course : list) {
			if(course.getId() == courseId) {
				c = course;
				break;
			}
		}
		return c;
	}
	
// to add course
	@Override
	public Course addCourse(Course course) {
		list.add(course);
		return course;
	}

// for update course
	@Override
	public Course updateCourse(Course course, long courseId) {
		list = list.stream().map(b->{
			if(b.getId() == courseId) {
				b.setTitle(course.getTitle());
				b.setDescription(course.getDescription());
			}
			return b;
		}).collect(Collectors.toList());
		return course;
	}
	
	
}
