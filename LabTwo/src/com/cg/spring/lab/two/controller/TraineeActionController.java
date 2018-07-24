package com.cg.spring.lab.two.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cg.spring.lab.two.bean.Trainee;
import com.cg.spring.lab.two.exception.InvalidInputException;
import com.cg.spring.lab.two.services.TraineeServices;

@Controller
public class TraineeActionController {
@Autowired(required=true)
TraineeServices tServices;
private boolean status=false;

@RequestMapping(value="/addTraineeDB")
public ModelAndView addTraineeDB(@ModelAttribute("trainee")Trainee trainee) {
	Trainee trainee1 = new Trainee();
	trainee1=tServices.insertTrainee(trainee);
	return new ModelAndView("traineeInfo","trainee",trainee1);
	
}
@RequestMapping(value="/login")
public ModelAndView adminlogin(@RequestParam("username")String uname, @RequestParam("password")String pass) throws InvalidInputException {
	if(uname.equals("admin") && pass.equals("admin"))
		return new ModelAndView("TraineeManagementSystem");
	else throw new InvalidInputException("Incorrect username/password");
	
}

@RequestMapping(value="/retrieveTraineeDB")
public ModelAndView retrieveTraineeDB(@RequestParam("traineeId")int traineeId) {
	Trainee trainee1 = new Trainee();
	trainee1=tServices.getTraineeDetails(traineeId);
	return new ModelAndView("traineeInfo","trainee",trainee1);
}
@RequestMapping(value="/modifyTraineeDB")
public ModelAndView modifyTraineeDB(@RequestParam("traineeId")int traineeId) {
	Trainee trainee1 = new Trainee();
	trainee1=tServices.getTraineeDetails(traineeId);
	return new ModelAndView("addTrainee","trainee",trainee1);
}
@RequestMapping(value="/deleteTraineeDB")
public ModelAndView deleteTraineeDB(@RequestParam("traineeId")int traineeId) {
	Trainee trainee1 = new Trainee();
	trainee1=tServices.getTraineeDetails(traineeId);
	tServices.deleteTrainee(tServices.getTraineeDetails(traineeId));;
	return new ModelAndView("traineeInfo","trainee",trainee1);
}
@RequestMapping(value="/retrieveAllTrainees")
public ModelAndView retrieveAllTrainees(){
	List<Trainee>list = new ArrayList<>(); 
	list=tServices.getAllTrainee();
return new ModelAndView("retrieveAllTrainees","trainee",list);	
}
}
