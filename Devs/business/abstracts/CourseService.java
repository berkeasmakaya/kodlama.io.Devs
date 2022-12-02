package Kodlama.io.Devs.business.abstracts;

import java.util.List;

import Kodlama.io.Devs.entities.concretes.Course;

public interface CourseService {
	void Add(Course course);
	void Delete(Course course);
	void Update(Course course);
	List<Course> GetAll();
	Course GetById(int id);
	
}
