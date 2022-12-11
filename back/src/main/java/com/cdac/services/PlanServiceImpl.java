package com.cdac.services;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdac.daos.PlanDao;
import com.cdac.daos.UserDao;
import com.cdac.pojos.Plan;
import com.cdac.pojos.User;

@Transactional
@Service
public class PlanServiceImpl  implements PlanService{
     
	@Autowired 
	private PlanDao planDao;
	
	@Override
	public Plan findById(int subplanId) {
		Optional<Plan> b = planDao.findById(subplanId);
		return b.orElse(null);
	}
	
	@Override
	public List<Plan> findAll() {
		return planDao.findAll();
	}
	
	@Override
	public Plan save(Plan pl) {
		return planDao.save(pl);
	}
	
	@Override
	public Plan update(Plan pl) {
		return planDao.save(pl);
	}

	@Override
	public void deleteById(int subplanId) {
		planDao.deleteById(subplanId);

	}
}
