package com.cg.spring.lab.two.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.spring.lab.two.bean.Trainee;

public interface TraineeRepo extends JpaRepository<Trainee, Integer>{

}
