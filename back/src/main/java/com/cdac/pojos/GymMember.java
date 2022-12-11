package com.cdac.pojos;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="GymMember")
public class GymMember {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int memberId;
	private String gender;
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date joinDate;
	private double height;
	private double weight;

	@OneToOne
	@JoinColumn(name="user_id")
	private User user;
	
	@OneToOne
	@JoinColumn(name="subplanId")
	private Plan plan;

	public GymMember() {
		
	}

	public GymMember(int memberId, String gender, Date joinDate, double height, double weight, User user, Plan plan) {
		
		this.memberId = memberId;
		this.gender = gender;
		this.joinDate = joinDate;
		this.height = height;
		this.weight = weight;
		this.user = user;
		this.plan = plan;
	}

	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Plan getPlan() {
		return plan;
	}

	public void setPlan(Plan plan) {
		this.plan = plan;
	}

	@Override
	public String toString() {
		return "GymMember [memberId=" + memberId + ", gender=" + gender + ", joinDate=" + joinDate + ", height="
				+ height + ", weight=" + weight + ", user=" + user + ", plan=" + plan + "]";
	}

//	@Override
//	public String toString() {
//		return "GymMember [memberId=" + memberId + ", gender=" + gender + ", joinDate=" + joinDate + ", height="
//				+ height + ", weight=" + weight + ", user=" + user + ", subplanId=" + plan + "]";
//	}

//	@Override
//	public String toString() {
//		return "GymMember [memberId=" + memberId + ", gender=" + gender + ", joinDate=" + joinDate + ", height="
//				+ height + ", weight=" + weight + "]";
//	}



//	@Override
//	public String toString() {
//		return "GymMember [memberId=" + memberId + ", gender=" + gender + ", joinDate=" + joinDate + ", height="
//				+ height + ", weight=" + weight + ", user=" + user + ", plan=" + plan + "]";
//	}
	
	
	
	
}
