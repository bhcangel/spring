package com.simple.service;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.simple.command.BoardVO;
import com.simple.mapper.BoardMapper;


@Repository("boardService")
public class BoardServiceImpl implements BoardService{
	
	/*
	 * 	1. board관련 mybatis 인터페이스 선언, 구현체를 생성
	 *  2. xml 파일에서는 아이디를 이용해서 매퍼태그를 생성
	 *  3. 서비스 영역에서 매퍼 주입하고, 추상메서드를 실행
	 */

	@Autowired
	private BoardMapper BoardMapper;
	
	@Override
	public void boardRegist(BoardVO vo) {
		// 1st
		BoardMapper.boardRegist(vo);
		
		// 2nd
//		HashMap<String, String> map = new HashMap<String, String>();
//		map.put("name", vo.getName());
//		map.put("title", vo.getTitle());
//		map.put("content", vo.getContent());
		
	}

	@Override
	public ArrayList<BoardVO> getList() {
		ArrayList<BoardVO> list = BoardMapper.getList();
		return list;
		
		
		
		
	}

	@Override
	public void boardDelete(int num) {
		// TODO Auto-generated method stub
		BoardMapper.boardDelete(num);
	}
	
//	@Autowired
//	private BoardDAO boardDao;
//
//	@Override
//	public void boardRegist(BoardVO vo) {
//		boardDao.boardRegist(vo);
//		
//	}
//
//	@Override
//	public ArrayList<BoardVO> getList() {
//		
//		ArrayList<BoardVO> list = boardDao.getList();
//		return list;
//	}
//
//	@Override
//	public void boardDelete(int num) {
//		
//		boardDao.boardDelete(num);
//		
//	}
		


}
