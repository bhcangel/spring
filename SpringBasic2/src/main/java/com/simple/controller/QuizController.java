package com.simple.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.simple.command.Quiz01VO;
import com.simple.command.Quiz02VO;
import com.simple.command.Quiz03VO;
import com.simple.command.ReqVO;

@Controller
@RequestMapping("/quiz")
public class QuizController {
	
	@RequestMapping("/quiz01")
	public String quiz01(){
		return "quiz/quiz01";
	}
	
//	@RequestMapping("/res_ex05")
//	public String res_ex05(@ModelAttribute("info") ReqVO vo) {
//		
//		System.out.println(vo.getId());
//		System.out.println(vo.getName());
//		
//		return "response/res_ex05";
//	}
	
	@RequestMapping("/sendBirth")
	public String sendBirth(@ModelAttribute("info") Quiz01VO vo){
		System.out.println("sendBirth");
		System.out.println(vo.getYear());
		System.out.println(vo.getMonth());
		System.out.println(vo.getDay());
		return "quiz/quiz01_ok";
	}
	
	@RequestMapping("/quiz02")
	public String quiz02() {
		return "quiz/quiz02";
	}
	
	@RequestMapping("/join")
	public String join(@ModelAttribute("info") Quiz02VO vo) {
		return "quiz/quiz02_ok";
	}
	
	
	
	
	@RequestMapping("/quiz03")
	public String quiz03() {
		return "quiz/quiz03";
	}
	
	@RequestMapping("/join2")
	public String join2(@ModelAttribute("info") Quiz03VO vo,
						RedirectAttributes RA) {
		System.out.println("id : " + vo.getId());
		System.out.println(vo.getPw());
		System.out.println(vo.getPw_check());
		if(vo.getId().equals("")) {
			RA.addFlashAttribute("msg","아이디를 입력하세요");
			return "redirect:/quiz/quiz03";
		} else if(!vo.getPw().equals(vo.getPw_check())){
			RA.addFlashAttribute("msg","비밀번호를 확인해주세요");
			return "redirect:/quiz/quiz03";
		} else {
			return "quiz/quiz03_ok";
		}
	}
	

}
