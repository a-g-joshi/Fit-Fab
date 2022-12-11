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
import com.cdac.services.DietplanService;


@RestController
@CrossOrigin
public class DietplanRestController {

	
	@Autowired
	private DietplanService dietplanService;
	
	  //get Dietplan by planId
		@GetMapping("/dietplans/{planid}")
		public ResponseEntity<?>findById(@PathVariable("planid") int id) {
			Map<String,Object>map= new HashMap<>();
			Dietplan dietplan = dietplanService.findById(id);
			 map.put("status", "success");
			 map.put("data", dietplan);
			return ResponseEntity.ok(map);
		}
		
		//get all user
		@GetMapping("/dietplans")
		public ResponseEntity<List<Dietplan>> findAll() {
			List<Dietplan> list = dietplanService.findAll();
			return new ResponseEntity<>(list, HttpStatus.OK);
		}
		
		//save or update user
		@PostMapping("/dietplans/save")
		public ResponseEntity<Dietplan> save(@RequestBody Dietplan dietplan){
			Dietplan dp = dietplanService.save(dietplan);
		   return ResponseEntity.ok(dp);
	   }
		
		//update user
		@PutMapping("/dietplans/update/{planid}")
		public ResponseEntity<Dietplan> update(@PathVariable("planid") int id,@RequestBody Dietplan dp){
		   dp.setPlanid(id);
		   Dietplan newDp = dietplanService.update(dp);
		   return ResponseEntity.ok(newDp);
	   }
		
		  //delete user
		   @DeleteMapping("/dietplans/delete/{planid}")
			public void delete(@PathVariable("planid") int id){
			   dietplanService.deleteById(id);
		   }
	
}
