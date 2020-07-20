package com.simple.board.mapper;

import java.util.ArrayList;

import com.simple.command.BoardVO2;

public interface BoardMapper {
	public void regist(BoardVO2 vo);
	public ArrayList<BoardVO2> getList();
}
