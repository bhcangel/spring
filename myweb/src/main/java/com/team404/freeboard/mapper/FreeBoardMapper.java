package com.team404.freeboard.mapper;

import java.util.ArrayList;

import com.team404.command.FreeBoardVO;
import com.team404.util.Criteria;

public interface FreeBoardMapper {
	public void regist(FreeBoardVO vo);
	public ArrayList<FreeBoardVO> getList(Criteria cri);
	public int getTotal(Criteria cri);
	public FreeBoardVO getContent(int bno);
	public int Modify(FreeBoardVO vo);
	public int Delete(int bno);
}
