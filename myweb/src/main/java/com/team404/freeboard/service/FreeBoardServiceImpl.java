package com.team404.freeboard.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.team404.command.FreeBoardVO;
import com.team404.freeboard.mapper.FreeBoardMapper;
import com.team404.util.Criteria;

@Service("freeBoardService")
public class FreeBoardServiceImpl implements FreeBoardService{

	@Autowired
	private FreeBoardMapper freeBoardMapper;
	
	@Override
	public void regist(FreeBoardVO vo) {
		freeBoardMapper.regist(vo);
	}

	@Override
	public ArrayList<FreeBoardVO> getList(Criteria cri) {
		
		return freeBoardMapper.getList(cri);
	}

	@Override
	public FreeBoardVO getContent(int bno) {
		return freeBoardMapper.getContent(bno);
	}

	@Override
	public int Modify(FreeBoardVO vo) {
		return freeBoardMapper.Modify(vo);
		
		
	}

	@Override
	public int Delete(int bno) {
		return freeBoardMapper.Delete(bno);
		
	}

	@Override
	public int getTotal() {
		
		return freeBoardMapper.getTotal();
	}

	
	
}
