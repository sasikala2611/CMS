package com.cms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cms.dao.CourseDAO;
import com.cms.entity.Course;



@Service
public class CourseService {
        
	@Autowired
	CourseDAO dao;
	
	public List<Course>  getCourse() {
		return dao.GetCourse();
	}
	
	
    public void saveCourse(Course c) {
        dao.save(c);
    }
    
    public void deleteCourse(int id) {
        dao.delete(id);
    }
    
     public Course getCourseById(int id) {
        return dao.getById(id);
    }
    
   
    public void updateCourse(Course c) {
        dao.update(c);
    }
	
}
