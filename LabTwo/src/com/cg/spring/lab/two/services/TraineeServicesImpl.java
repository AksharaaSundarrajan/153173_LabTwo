package com.cg.spring.lab.two.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cg.spring.lab.two.bean.Trainee;
import com.cg.spring.lab.two.repo.TraineeRepo;
@Component(value="tServices")
public class TraineeServicesImpl implements TraineeServices{
	@Autowired(required=true)
	private TraineeRepo repo;
	@Override
	public Trainee insertTrainee(Trainee trainee) {
		return repo.save(trainee);
	}

	@Override
	public void deleteTrainee(Trainee trainee) {
		repo.delete(trainee);
		
	}

	@Override
	public void modifyTraineeDetails(Trainee trainee) {
		repo.save(trainee);
		
	}

	@Override
	public Trainee getTraineeDetails(int traineeID) {
		return repo.findOne(traineeID);
	}

	@Override
	public List<Trainee> getAllTrainee() {
		return repo.findAll();
	}

}
