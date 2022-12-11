package com.cdac.pojos;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="plan")
public class Plan {
   
	@Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int subplanId;
	private String planName;
	private int duration;
	private int amount;
	/*
	 * @OneToOne(mappedBy = "plan") private GymMember gymmember;
	 */
	
	public Plan() {
		
	}

	public Plan(int subplanId, String planName, int duration, int amount) {
		
		this.subplanId = subplanId;
		this.planName = planName;
		this.duration = duration;
		this.amount = amount;
		//this.gymmember = gymmember;
	}

	public int getSubplanId() {
		return subplanId;
	}

	public void setSubplanId(int subplanId) {
		this.subplanId = subplanId;
	}

	public String getPlanName() {
		return planName;
	}

	public void setPlanName(String planName) {
		this.planName = planName;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	/*
	 * public GymMember getGymmember() { return gymmember; }
	 * 
	 * public void setGymmember(GymMember gymmember) { this.gymmember = gymmember; }
	 */
	@Override
	public String toString() {
		return "Plan [planName=" + planName + ", duration=" + duration + ", amount="
				+ amount +  "]";
	}

	
	
	
	
}
