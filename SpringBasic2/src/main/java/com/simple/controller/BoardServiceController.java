package com.simple.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.simple.command.BoardVO;
import com.simple.service.BoardServiceImpl;
import com.simple.service.ScoreServiceImpl;

@Controller
@RequestMapping("/service")
public class BoardServiceController {
	
	@Autowired
	private BoardServiceImpl boardService;
	
	@RequestMapping("/boardRegister")
	public void boardRegister() {
		
	}
	
	@RequestMapping("/boardForm")
	public String boardForm(@ModelAttribute("info") BoardVO vo) {
		boardService.boardRegist(vo);
		return "service/boardResult";
	}
	
	@RequestMapping("/boardList")
	public String boardList(Model model) {
		ArrayList<BoardVO> list = boardService.getList();
		model.addAttribute("list",list);
		return "service/boardList";
	}

}
