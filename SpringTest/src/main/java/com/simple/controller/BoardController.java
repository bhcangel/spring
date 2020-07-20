package com.simple.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


import com.simple.command.BoardVO2;
import com.simple.board.service.BoardService;

@Controller
@RequestMapping("/board")
public class BoardController {

   
   @Autowired
   private BoardService boardService; //서비스 입력값을 적는다
   
   
   @RequestMapping("minwon_list")
   
   public String minwon_list(Model model) {

	   System.out.println("12313");
      model.addAttribute("list",boardService.getList());
      return "board/minwon_list";
      
   }
   
   @RequestMapping("minwon_reg")
   public String minwon_reg() {
      System.out.println("regist");
      return "board/minwon_reg";
      
   }
   
   @RequestMapping("minwon_regView")
   public String minwon_regView() {
      
      return "board/minwon_regView";
      
   }
   // 등록 폼처리
      @RequestMapping(value = "/registForm")
      public String registForm(BoardVO2 vo, RedirectAttributes RA) {
         
         RA.addFlashAttribute("msg", "정상처리되었습니다");
         
         boardService.regist(vo);
         
         return "redirect:/board/minwon_list";
      }
}