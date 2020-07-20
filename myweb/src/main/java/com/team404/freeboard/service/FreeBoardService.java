package com.team404.freeboard.service;

import java.util.ArrayList;

import com.team404.command.FreeBoardVO;
import com.team404.util.Criteria;

public interface FreeBoardService {
	public void regist(FreeBoardVO vo);	//글 등록
	public ArrayList<FreeBoardVO> getList(Criteria cri);		//글 목록
	public int getTotal(Criteria cri);		//총 게시글 수
	public FreeBoardVO getContent(int bno);
	public int Modify(FreeBoardVO vo);
	public int Delete(int bno);
}
