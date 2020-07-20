package com.simple.board.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simple.board.mapper.BoardMapper;
import com.simple.command.BoardVO2;

@Service("boardService")
public class BoardServiceImpl implements BoardService {
	
	@Autowired 
	private BoardMapper boardMapper;
	
	@Override
	public void regist(BoardVO2 vo) {
	
		boardMapper.regist(vo);
	}

	@Override
	public ArrayList<BoardVO2> getList() {
		
		return boardMapper.getList();
	}

}
