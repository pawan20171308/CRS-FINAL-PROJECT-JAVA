/**
 * 
 */
package com.lti.dao;

import java.util.List;

import com.lti.bean.Course;
import com.lti.bean.Proffessor;

/**
 * this interface is implemented by ProfessorDaoOperations class
 */
public interface ProfessorDaoInterface {

	public void selectCourse(int courseId ,Proffessor professor);
	public void deselectCourse(int courseId, Proffessor professor);
	public List<Course> displaySelectedCoursesProfessor(Proffessor professor);

}
