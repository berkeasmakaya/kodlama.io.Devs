package Kodlama.io.Devs.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Kodlama.io.Devs.business.abstracts.CourseService;
import Kodlama.io.Devs.dataAccess.abstracts.CourseDao;
import Kodlama.io.Devs.entities.concretes.Course;

@Service
public class CourseManager implements CourseService{
	CourseDao _courseDao;
	
	@Autowired
	public CourseManager(CourseDao _courseDao) {
		this._courseDao = _courseDao;
	}

	@Override
	public void Add(Course course) {
		_courseDao.add(course);	
	}

	@Override
	public void Delete(Course course) {
		_courseDao.delete(course);
		
	}

	@Override
	public void Update(Course course) {
		_courseDao.update(course);
		
	}

	@Override
	public List<Course> GetAll() {
		return _courseDao.getAll();
		
	}

	@Override
	public Course GetById(int id) {
		return _courseDao.geyById(id);
	}

}
