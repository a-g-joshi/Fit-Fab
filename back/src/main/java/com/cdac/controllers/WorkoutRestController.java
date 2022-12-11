package com.cdac.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cdac.pojos.Dietplan;
import com.cdac.pojos.Workoutplan;
import com.cdac.services.DietplanService;
import com.cdac.services.WorkoutplanService;

@RestController
@CrossOrigin
public class WorkoutRestController {
    
	@Autowired
	private WorkoutplanService workoutplanService;
	
	        //get Workoutplan by workoutId
			@GetMapping("/workouts/{workoutid}")
			public ResponseEntity<?>findById(@PathVariable("workoutid") int id) {
				Map<String,Object>map= new HashMap<>();
				Workoutplan workoutplan = workoutplanService.findById(id);
				 map.put("status", "success");
				 map.put("data", workoutplan);
				return ResponseEntity.ok(map);
			}
			
			//get all workouts
			@GetMapping("/workouts")
			public ResponseEntity<List<Workoutplan>> findAll() {
				List<Workoutplan> list = workoutplanService.findAll();
				return new ResponseEntity<>(list, HttpStatus.OK);
			}
			
			//save or update workouts
			@PostMapping("/workouts/save")
			public ResponseEntity<Workoutplan> save(@RequestBody Workoutplan workoutplan){
				Workoutplan dp = workoutplanService.save(workoutplan);
			   return ResponseEntity.ok(dp);
		   }
			
			
			//update workout
			@PutMapping("/workouts/update/{workoutid}")
			public ResponseEntity<Workoutplan> update(@PathVariable("workoutid") int id,@RequestBody Workoutplan dp){
			   dp.setWorkoutid(id);
			   Workoutplan newDp = workoutplanService.update(dp);
			   return ResponseEntity.ok(newDp);
		   }
			
			  //delete workout
			   @DeleteMapping("/workouts/delete/{workoutid}")
				public void delete(@PathVariable("workoutid") int id){
				   workoutplanService.deleteById(id);
			   }
			
			
			
			
}
