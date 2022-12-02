package Kodlama.io.Devs.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import Kodlama.io.Devs.dataAccess.abstracts.CourseDao;
import Kodlama.io.Devs.entities.concretes.Course;

@Repository
public class InMemoryCourseDao implements CourseDao {
	
	List<Course> courses;
	
	public InMemoryCourseDao() {
		courses = new ArrayList<Course>();
		courses.add(new Course(1,"JAVA",0,"Engin Demiroğ"));
		courses.add(new Course(2,"C#",0,"Engin Demiroğ"));
		courses.add(new Course(3,"Python",0,"Engin Demiroğ"));
		courses.add(new Course(4,"C",0,"Engin Demiroğ"));
	}
	
	@Override
	public void add(Course course) {
		if (doesCourseNameExist(course)) {
			courses.add(course);
		}
		
	}

	@Override
	public void delete(Course course) {
		courses.remove(course.getId());
		
	}

	@Override
	public void update(Course course) {
		for (Course crs : courses) {
			if (course.getId() == crs.getId()) {
				crs.setId(course.getId());
				crs.setName(course.getName());
			}
		}	
	}

	@Override
	public List<Course> getAll() {
		
		return courses;
	}

	@Override
	public Course geyById(int id) {
		for (Course course : courses) {
			if (course.getId() == id) {
				return course;
			}
		}
		return null;
	}
	
	private boolean doesCourseNameExist(Course course) {
		for (Course crs : courses) {
			if (crs.getName().equals(course.getName())) {
				return false;
			}
		}
		return true;
	}

}
