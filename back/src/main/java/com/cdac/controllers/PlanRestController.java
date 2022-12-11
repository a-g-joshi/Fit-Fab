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

import com.cdac.pojos.Plan;
import com.cdac.pojos.User;
import com.cdac.services.PlanService;


@CrossOrigin
@RestController
public class PlanRestController {

	@Autowired
	private PlanService planService;
	
	   //get plans by Id
		@GetMapping("/plans/{subplanId}")
		public ResponseEntity<?>findById(@PathVariable("subplanId") int id) {
			Map<String,Object>map= new HashMap<>();
			Plan pl = planService.findById(id);
			 map.put("status", "success");
			 map.put("data", pl);
			return ResponseEntity.ok(map);
		}
		
		//get all plans
		@GetMapping("/plans")
		public ResponseEntity<List<Plan>> findAll() {
			List<Plan> list = planService.findAll();
			return new ResponseEntity<>(list, HttpStatus.OK);
		}
		
	    //save or update plans
		@PostMapping("/plans/save")
		public ResponseEntity<Plan> save(@RequestBody Plan pl){
			Plan newPlan = planService.save(pl);
		   return ResponseEntity.ok(newPlan);
	   }
		
	  	//update plans
		@PutMapping("/plans/update/{subplanId}")
		public ResponseEntity<Plan> update(@PathVariable("subplanId") int id,@RequestBody Plan pl){
		   pl.setSubplanId(id);
		   Plan newPlan = planService.update(pl);
		   return ResponseEntity.ok(newPlan);
	   }
		
		 //delete plan
		  @DeleteMapping("/plans/delete/{subplanId}")
		public void delete(@PathVariable("subplanId") int id){
			  planService.deleteById(id);
		  }
		
		
}
