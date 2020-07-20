package com.team404.controller2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.team404.command.TestVO;
import com.team404.command.TestVO2;

@RestController
public class RestBasicController {

	// 1. RestController는 기본적으로 return에 실린 값이 리졸버 뷰로 전달되는데 아니라, 요청된 주소로 반환됩니다.
	
	@CrossOrigin(origins="*")
	@GetMapping(value="/getText", produces = "text/plain; charset=utf-8")
	public String getText(HttpServletRequest request) {
		System.out.println(request.getRemoteAddr());
		return "안녕하세요";
	}
	
	//객체반환 (반드시 제이슨 데이터바인딩 라이브러리가 필요합니다)
	@GetMapping("/getObject")
	public TestVO getObject() {
		return new TestVO(1,"홍길동","kkk123");
	}
	
	//값을 받고, 객체를 반환
	@GetMapping("/getCollection")
	public ArrayList<TestVO> getCollection(@RequestParam("nam") String num) {
		ArrayList<TestVO> list = new ArrayList<>();
		for(int i = 1; i <= 10; i++) {
			TestVO vo = new TestVO(i, "홍길자", "aaa123");
			list.add(vo);
			
		}
		return list;
	}
	
	//queryString으로 /값/값/값 형태로 받고 Map으로 반환
	@GetMapping("/getPath/{id}/{pw}/{name}")
	public HashMap<String, TestVO2> getPath(@PathVariable("id") String id,
											@PathVariable("pw") String pw,
											@PathVariable("name") String name
			) {
		
		System.out.println(id);
		System.out.println(pw);
		System.out.println(name);
		
		HashMap<String, TestVO2> map = new HashMap<>();
		TestVO2 vo = new TestVO2(id, pw, name);
		map.put("info",vo);
		
		return map;
	}
	
	
	//json형태로 받고, 객체로 반환
	//구글 확장 프로그램 rest Client
	@PostMapping("/getJson")
	public ArrayList<TestVO> getJson(@RequestBody TestVO vo){
		
		ArrayList<TestVO> list = new ArrayList<>();
		list.add(vo);
		
		System.out.println(list);
		
		return list;
	}
	
}
