package com.cdac.pojos;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="workoutplan")
public class Workoutplan {
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private int workoutid;
	 private String workoutname;
	 private String set1;
	 private String set2;
	 private String set3;
	 
	 public Workoutplan() {
		
	}

	public Workoutplan(int workoutid, String workoutname, String set1, String set2, String set3) {
		
		this.workoutid = workoutid;
		this.workoutname = workoutname;
		this.set1 = set1;
		this.set2 = set2;
		this.set3 = set3;
	}

	public int getWorkoutid() {
		return workoutid;
	}

	public void setWorkoutid(int workoutid) {
		this.workoutid = workoutid;
	}

	public String getWorkoutname() {
		return workoutname;
	}

	public void setWorkoutname(String workoutname) {
		this.workoutname = workoutname;
	}

	public String getSet1() {
		return set1;
	}

	public void setSet1(String set1) {
		this.set1 = set1;
	}

	public String getSet2() {
		return set2;
	}

	public void setSet2(String set2) {
		this.set2 = set2;
	}

	public String getSet3() {
		return set3;
	}

	public void setSet3(String set3) {
		this.set3 = set3;
	}

	@Override
	public String toString() {
		return "Workoutplan [workoutid=" + workoutid + ", workoutname=" + workoutname + ", set1=" + set1 + ", set2="
				+ set2 + ", set3=" + set3 + "]";
	}
	 
	 
	 
}
