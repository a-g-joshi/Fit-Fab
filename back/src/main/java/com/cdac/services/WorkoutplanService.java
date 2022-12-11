package com.cdac.services;

import java.util.List;

import com.cdac.pojos.Workoutplan;

public interface WorkoutplanService {
	    Workoutplan findById(int workoutid);
	    List<Workoutplan>findAll();
	    Workoutplan save(Workoutplan wp);
	    Workoutplan  update(Workoutplan wp);
	    void deleteById(int workoutid );
}
