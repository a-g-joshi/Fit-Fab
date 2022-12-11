package com.cdac.services;

import java.util.List;

import com.cdac.pojos.Dietplan;
import com.cdac.pojos.User;

public interface DietplanService {
	    Dietplan findById(int planid);
	    List<Dietplan>findAll();
	    Dietplan save(Dietplan dp);
	    Dietplan  update(Dietplan dp);
	    void deleteById(int planid);
}