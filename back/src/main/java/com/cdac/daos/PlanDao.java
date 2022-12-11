package com.cdac.daos;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;

import com.cdac.pojos.Plan;
import com.cdac.pojos.User;


public interface PlanDao extends JpaRepository<Plan , Integer> {
	//User findByEmail(String email);
	//List<User> findByRole(String role);
}
