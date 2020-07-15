package com.team404.controller;

import java.util.ArrayList;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.team404.command.FreeBoardVO;
import com.team404.freeboard.service.FreeBoardService;
import com.team404.util.Criteria;
import com.team404.util.PageVO;

@Controller
@RequestMapping("/freeBoard")
public class FreeBoardController {
	
	@Autowired
	@Qualifier("freeBoardService")
	private FreeBoardService freeBoardService;

	@RequestMapping("/freeList")
	public String freeList(Model model, Criteria cri) {
		
		ArrayList<FreeBoardVO> list =  freeBoardService.getList(cri);	
		int total = freeBoardService.getTotal();
		
		PageVO pageVO = new PageVO(cri, total);
		
		model.addAttribute("boardList", list);
		model.addAttribute("pageVO", pageVO);
		
		return "freeBoard/freeList";
	}
	
	@RequestMapping("/freeDetail")
	public String freeDetail(@RequestParam("bno") int bno, Model model) {
		
		FreeBoardVO vo = freeBoardService.getContent(bno);
		model.addAttribute("Detail", vo);
		
		return "freeBoard/freeDetail";
	}
	
	@RequestMapping("/freeModify")
	public String freeModify(@RequestParam("bno") int bno, Model model) {
		
		FreeBoardVO vo = freeBoardService.getContent(bno);
		model.addAttribute("vo",vo);
		
		return "freeBoard/freeModify";
		
	}
	
	@RequestMapping("/freeRegist")
	public String freeRegist() {
		return "freeBoard/freeRegist";
	}
	
	@RequestMapping(value = "/registForm", method = RequestMethod.POST)
	public String registForm(FreeBoardVO vo, RedirectAttributes RA) {
		
		//실험용출력
		//System.out.println(vo.toString());
		
		//등록 성공 여부(msg)
		RA.addFlashAttribute("msg", "정상 등록 처리되었습니다");
		
		freeBoardService.regist(vo);
		return "redirect:/freeBoard/freeList";	//등록후에 리스트화면으로 리다이렉트
	}
	
	
	
	@RequestMapping("/freeModify2")
	public String freeUpdate(FreeBoardVO vo, RedirectAttributes RA) {
		
		int result = freeBoardService.Modify(vo);
		if(result == 1) {
		RA.addFlashAttribute("msg", "정상 수정 처리되었습니다");
		} 
		else {
			RA.addFlashAttribute("msg", "정상 수정 되지않았습니다");
		}
		
		return "redirect:/freeBoard/freeList";
	}
	
	
	@RequestMapping("/freeDelete")
	public String freeDelete(int bno, RedirectAttributes RA) {
		System.out.println("1111111");
		int result = freeBoardService.Delete(bno);
		
		if(result == 1) {
			RA.addFlashAttribute("msg", "정상 삭제 되었습니다");
			} 
			else {
				RA.addFlashAttribute("msg", "정상 삭제 되지 않았습니다");
			}
		
		return "redirect:/freeBoard/freeList";
	}
}
