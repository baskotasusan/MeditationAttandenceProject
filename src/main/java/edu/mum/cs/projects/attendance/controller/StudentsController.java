/**
 * 
 */
package edu.mum.cs.projects.attendance.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.mum.cs.projects.attendance.domain.entity.CourseOffering;
import edu.mum.cs.projects.attendance.service.IServiceFacade;

/**
 * @author Sushan
 *Jul 17, 2017
 */
@Controller
public class StudentsController {

	@Autowired
	private IServiceFacade serviceFacade;
	
	@RequestMapping(value = "/studentCourseList")
	public String getStudentEnrolledCourses(Model model){
		List<CourseOffering> courseList = serviceFacade.getCourseListForStudent("000-98-2993");
		//model.addAttribute("courseList", courseList);
		System.out.println("<---------CourseList---------->" +courseList);
		return null;
	}
}
