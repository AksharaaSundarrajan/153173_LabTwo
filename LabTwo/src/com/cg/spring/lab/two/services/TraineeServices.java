package com.cg.spring.lab.two.services;

import java.util.List;

import com.cg.spring.lab.two.bean.Trainee;

public interface TraineeServices {
	Trainee insertTrainee(Trainee trainee);
	void deleteTrainee(Trainee trainee);
	void modifyTraineeDetails(Trainee trainee);
	Trainee getTraineeDetails(int traineeID);
	List<Trainee> getAllTrainee();
}
