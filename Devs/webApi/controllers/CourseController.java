package Kodlama.io.Devs.webApi.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Kodlama.io.Devs.business.abstracts.CourseService;
import Kodlama.io.Devs.entities.concretes.Course;

@RestController
@RequestMapping("/api/courses")
public class CourseController {
	private CourseService courseService;
	
	@Autowired
	public CourseController(CourseService courseService) {
		this.courseService = courseService;
	}
	
	@GetMapping("/getall")
	public List<Course> getAll(){
		return courseService.GetAll();
	}
	
}
