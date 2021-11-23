/**
 * 
 */
package com.lti.service;

import java.util.List;

import com.lti.bean.Student;
import com.lti.dao.GradeDaoInterface;
import com.lti.dao.GradeDaoOperations;

/**
 * this class will hold functions for GradeInterface Implementation
 * examples include 
 *
 */
public class GradeOperations implements GradeInterface {

	GradeDaoInterface gradeDao = new GradeDaoOperations();
	
	@Override
	public void displayGrades(Student student) {
		
		System.out.println("***********************************REPORT CARD******************************");	
		System.out.println("COURSE ID      COURSE NAME                     GRADE");
		List<com.lti.bean.Course> courses = gradeDao.displayGrades(student);

		courses.forEach(course -> System.out.println(course.getCourseId()+"               "+course.getCourseName()+"                       "+"Course Grade"));

		System.out.println("*****************************************************************************");
	

	}

	
	@Override
	public void uploadGrades(int studentId, int courseId, String grade) {
		gradeDao.uploadGrades(studentId, courseId, grade);

	}

}
