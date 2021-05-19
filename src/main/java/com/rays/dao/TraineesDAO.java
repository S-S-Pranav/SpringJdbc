package com.rays.dao;

import java.util.List;

import com.rays.model.Trainees;

public interface TraineesDAO {

	//CURD operation
	public int insertTrainees(Trainees T);
	public List<Trainees> getAllTrainees();
	public Trainees getTraineesById(int aid);
	public int updateTrainees(Trainees T);
	public int deleteTrainees(int aid);
}
