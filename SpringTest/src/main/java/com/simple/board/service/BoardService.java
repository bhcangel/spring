package com.simple.board.service;

import java.util.ArrayList;

import com.simple.command.BoardVO2;

public interface BoardService {
	
	public void regist(BoardVO2 vo);//글등록
	public ArrayList<BoardVO2> getList();//글목록

}
