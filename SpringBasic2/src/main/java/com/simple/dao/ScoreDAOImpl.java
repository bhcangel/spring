package com.simple.dao;

import java.util.ArrayList;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.simple.command.ScoreVO;

//@Service("scoreDAO")
//@Component
@Repository("scoreDAO")
public class ScoreDAOImpl implements ScoreDAO{
	
	//DB라고 가정
	private ArrayList<ScoreVO> DB = new ArrayList<>();

	@Override
	public void scoreRegist(ScoreVO vo) {
		// TODO Auto-generated method stub
		DB.add(vo);
		System.out.println(DB.toString());
	}

	@Override
	public ArrayList<ScoreVO> scoreList() {
		// TODO Auto-generated method stub
		return DB;
	}

}
