package com.rays.model;

public class Trainees {
	private int aid;
	private String tName;
	private int tAge;
	private String tCity;
	
	public Trainees() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Trainees(int aid, String tName, int tAge, String tCity) {
		super();
		this.aid = aid;
		this.tName = tName;
		this.tAge = tAge;
		this.tCity = tCity;
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String gettName() {
		return tName;
	}
	public void settName(String tName) {
		this.tName = tName;
	}
	public int gettAge() {
		return tAge;
	}
	public void settAge(int tAge) {
		this.tAge = tAge;
	}
	public String gettCity() {
		return tCity;
	}
	public void settCity(String tCity) {
		this.tCity = tCity;
	}
	@Override
	public String toString() {
		return "Trainees [aid=" + aid + ", tName=" + tName + ", tAge=" + tAge + ", tCity=" + tCity + "]";
	}
	
	

}
