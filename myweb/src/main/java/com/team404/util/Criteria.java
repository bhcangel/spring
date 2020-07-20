package com.team404.util;

import lombok.Data;

@Data	//게터,세터 자동생성
public class Criteria {
	
	//화면에서 전달할 값들을 가지고 다닐 클래스
	private int pageNum;
	private int amount;
	
	//검색에 필요한 데이터를 변수로 선언.
	private String searchType;
	private String searchName;
	
	public Criteria() {			//글 목록 화면으로 처음 진입할때는 값이 아무것도 없으므로 기본 생성자에서 기본값을 넣어주는 과정이 필요
		this(1,10);
	}

	public Criteria(int pageNum, int amount) {
		super();
		this.pageNum = pageNum;
		this.amount = amount;
	}
	
	
	
	
}
