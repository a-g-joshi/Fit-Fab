package com.cdac.controllers;

import java.util.HashMap;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cdac.pojos.User;
import com.cdac.services.UserService;

@CrossOrigin
@RestController
public class UserRestController {

	@Autowired
	private UserService userService;
	
	

   //get user by Id
	@GetMapping("/users/{user_id}")
	public ResponseEntity<?>findById(@PathVariable("user_id") int id) {
		Map<String,Object>map= new HashMap<>();
		 User user = userService.findById(id);
		 map.put("status", "success");
		 map.put("data", user);
		return ResponseEntity.ok(map);
	}
	//get user by email
	@GetMapping("/users/email/{email}")
	public ResponseEntity<User> findByEmail(@PathVariable("email") String email) {
		User user = userService.findByEmail(email);
		if(user == null)
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		return ResponseEntity.ok(user);
	}
	
	//get all user
	@GetMapping("/users")
	public ResponseEntity<List<User>> findAll() {
		List<User> list = userService.findAll();
		return new ResponseEntity<>(list, HttpStatus.OK);
	}
    //save or update user(member)
	@PostMapping("/users/save")
	public ResponseEntity<User> save(@RequestBody User user){
		user.setRole("member");
	   User newUser = userService.save(user);
	   return ResponseEntity.ok(newUser);
   }
	
	  //save or update user(admin + trainer)
		@PostMapping("/users/saveAdTrain")
		public ResponseEntity<User> saveAdTrain(@RequestBody User user){
		   User newUser = userService.save(user);
		   return ResponseEntity.ok(newUser);
	   }

   	//update user
	@PutMapping("/users/update/{user_id}")
	public ResponseEntity<User> update(@PathVariable("user_id") int id,@RequestBody User user){
	   user.setUser_id(id);
	   User newUser = userService.update(user);
	   return ResponseEntity.ok(newUser);
   }
   
    //delete user
   @DeleteMapping("/users/delete/{user_id}")
	public void delete(@PathVariable("user_id") int id){
		userService.deleteById(id);
   }
   
 
}
