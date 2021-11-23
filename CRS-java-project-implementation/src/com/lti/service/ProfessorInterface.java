/**
 * 
 */
package com.lti.service;

import com.lti.bean.Proffessor;

/**
 * this interface is implemented by ProfessorOperations class
 *
 */
public interface ProfessorInterface {
	public void selectCourse(int courseId ,Proffessor professor);
	public void deselectCourse(int courseId, Proffessor professor);
	public void displaySelectedCoursesProfessor(Proffessor professor);
}
