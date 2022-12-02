package Kodlama.io.Devs.dataAccess.abstracts;

import java.util.List;

import Kodlama.io.Devs.entities.concretes.Course;


public interface CourseDao {
	void add(Course course);
	void delete(Course course);
	void update(Course course);
	List<Course> getAll();
	Course geyById(int id);
}
