package com.cdac.daos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cdac.pojos.Dietplan;


public interface DietplanDao  extends JpaRepository<Dietplan , Integer> {

}
