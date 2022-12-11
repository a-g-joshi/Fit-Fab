package com.cdac.daos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cdac.pojos.Workoutplan;

public interface WorkoutplanDao  extends JpaRepository<Workoutplan , Integer>{

}
