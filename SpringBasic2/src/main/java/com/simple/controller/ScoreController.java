package com.simple.controller;

import java.util.ArrayList;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.simple.command.ScoreVO;
import com.simple.service.BoardServiceImpl;
import com.simple.service.ScoreService;
import com.simple.service.ScoreServiceImpl;

@Controller
@RequestMapping("/service1")
public class ScoreController {
	
	// 1st
	//private ScoreServiceImpl service = new ScoreServiceImpl();
	
	
	// 2nd
	//@Resource(name="scoreService")		//이름으로 찾음 (둘 중 하나 선택)
	//@Autowired							//타입으로 찾음
	//private ScoreServiceImpl scoreService;
	
	
	// 3rd
	@Autowired
	private ScoreServiceImpl scoreService;
	
	
	//화면처리
	@RequestMapping("/scoreRegist")
	public void scoreRegist() {
		
	}
	
	//점수 등록 요청
	@RequestMapping("/scoreForm")
	public String scoreForm(ScoreVO vo) {
		
		scoreService.scoreRegist(vo);
		
		//처리...
		
		return "service/scoreResult";
	}
	
	
	//점수 화면 요청
	@RequestMapping("/scoreList")
	public String scoreList(Model model) {
		
		ArrayList<ScoreVO> list = scoreService.scoreList();
		
		model.addAttribute("list", list);
		
		return "service/scoreList";
	}
	
	
	
	
	
	
	
	
	
	
}
