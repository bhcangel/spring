package com.simple.service;

import java.util.ArrayList;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simple.command.ScoreVO;
import com.simple.mapper.ScoreMapper;

@Service("scoreService") //而댄룷�꼳�듃 �뒪罹붿씠 �씫�뼱�꽌 ScoreService�씠由꾩쑝濡� 鍮덉쓣 �깮�꽦
public class ScoreServiceImpl implements ScoreService{
	
	@Autowired
	private ScoreMapper scoreMapper;

	@Override
	public void ScoreRegist(ScoreVO vo) {
		int result = scoreMapper.scoreRegist(vo);
		System.out.println("성공 / 실패 : " + result);
		
	}

	@Override
	public ArrayList<ScoreVO> scoreList() {
		ArrayList<ScoreVO> list = scoreMapper.scoreList();
		return list;
	}

	@Override
	public void scoreDelete(int num) {
		// TODO Auto-generated method stub
		scoreMapper.scoreDelete(num);
	}
	
//	@Autowired
//	private ScoreDAO scoreDao;
//	
//
//	@Override
//	public void ScoreRegist(ScoreVO vo) {
//		
//		scoreDao.scoreRegist(vo);
//	}
//
//
//	@Override
//	public ArrayList<ScoreVO> scoreList() {
//		ArrayList<ScoreVO> list = scoreDao.scoreList();
//		return list;
//	}
//
//
//	@Override
//	public void scoreDelete(int num) {
//		 scoreDao.scoreDelete(num);
//	
//	}

}
