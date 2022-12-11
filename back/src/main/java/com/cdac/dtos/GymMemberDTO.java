package com.cdac.dtos;

import java.util.Date;

import com.cdac.pojos.GymMember;

public class GymMemberDTO {
	private int memberId;
	private String gender;
	private double height;
	private Date joinDate;
	private double weight;
	private int subplanId;
	private int user_id;

	public GymMemberDTO() {

	}

	public GymMemberDTO(int memberId, String gender, double height, Date joinDate, double weight, int subplanId,
			int user_id) {

		this.memberId = memberId;
		this.gender = gender;
		this.height = height;
		this.joinDate = joinDate;
		this.weight = weight;
		this.subplanId = subplanId;
		this.user_id = user_id;
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

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public Date getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public int getSubplanId() {
		return subplanId;
	}

	public void setSubplanId(int subplanId) {
		this.subplanId = subplanId;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	@Override
	public String toString() {
		return "GymMemberDTO [memberId=" + memberId + ", gender=" + gender + ", height=" + height + ", joinDate="
				+ joinDate + ", weight=" + weight + ", subplanId=" + subplanId + ", user_id=" + user_id + "]";
	}

	public static GymMemberDTO fromEntity(GymMember gm) {
		GymMemberDTO dto = new GymMemberDTO();
		dto.setMemberId(gm.getMemberId());
		dto.setGender(gm.getGender());
		dto.setHeight(gm.getHeight());
		dto.setJoinDate(gm.getJoinDate());
		dto.setWeight(gm.getWeight());
		// dto.setSubplanId(gm.getPlan().getSubplanId());
		dto.setUser_id(gm.getUser().getUser_id());
		dto.setSubplanId(gm.getPlan().getSubplanId());
		return dto;
	}

	public static GymMember toEntity(GymMemberDTO dto) {
		GymMember gm = new GymMember();
		gm.setMemberId(dto.getMemberId());
		gm.setGender(dto.getGender());
		gm.setHeight(dto.getHeight());
		// gm.setJoinDate(dto.getJoinDate());
		gm.setWeight(dto.getWeight());

		// gm.getPlan().setSubplanId(dto.getSubplanId());
		// gm.getUser().setUser_id(dto.getUser_id());
		// gm.getPlan().setSubplanId(dto.getSubplanId());
		// gm.getUser().setUser_id(dto.getUser_id());

		return gm;
	}

}
