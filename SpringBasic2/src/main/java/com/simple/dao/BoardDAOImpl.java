package com.simple.dao;

import java.util.ArrayList;

import com.simple.command.BoardVO;

public class BoardDAOImpl implements BoardDAO{
	
	private ArrayList<BoardVO> DB = new ArrayList<>();

	@Override
	public void boardRegist(BoardVO vo) {
		DB.add(vo);
		System.out.println(DB.toString());
		
	}

	@Override
	public ArrayList<BoardVO> getList() {
		return DB;
	}

	@Override
	public void boardDelete(int num) {
		// TODO Auto-generated method stub
		
	}

}
