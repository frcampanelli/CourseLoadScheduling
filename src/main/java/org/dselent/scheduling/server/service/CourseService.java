package org.dselent.scheduling.server.service;

import java.sql.SQLException;
import java.util.List;

import org.dselent.scheduling.server.model.Courses;
import org.springframework.stereotype.Service;

@Service
public interface CourseService {
   //creates a course
	public List<Integer> create(String courseName, String courseNumber, int frequency) throws SQLException;
    
	//edits a course
    public List<Integer> edit(String courseName, String courseNumber, int frequency) throws SQLException;
   
    //remove a course, returns id of deleted course
    public Integer removeCourse(Integer id);
  
    //view all courses
    public List<Courses> viewAllCourse();
       
    //views one course based on id
    public Courses viewOneCourse(Integer id);
}
