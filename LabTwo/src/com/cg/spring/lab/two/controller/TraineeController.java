package com.cg.spring.lab.two.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cg.spring.lab.two.bean.Trainee;

@Controller
public class TraineeController {
//public static TraineeServiceImpl traineeService;

@RequestMapping(value="/")
public String getLoginPage()
{
	return "loginPage";
}

@RequestMapping(value="/TraineeManagementSystem")
public String getTMSPage()
{
	return "TraineeManagementSystem";
}
@RequestMapping(value="/deleteTrainee")
public String getRemoveTrainee()
{
	return "deleteTrainee";
}
@RequestMapping(value="/addTrainee")
public String getAddTrainee()
{
	return "addTrainee";
}
@RequestMapping(value="/modifyTrainee")
public String getModifyTrainee()
{
	return "modifyTrainee";
}
@RequestMapping(value="/retrieveTrainee")
public String getRetrieveTrainee()
{
	return "retrieveTrainee";
}
@ModelAttribute("trainee")
public Trainee getTrainee()
{
return new Trainee();	
}
/*@RequestMapping(value="/TraineeManagementSystem")
public String getRetrieveAllTrainees()
{
	return "TraineeManagementSystem";
}
*/


}
