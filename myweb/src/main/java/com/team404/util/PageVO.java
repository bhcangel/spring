package com.team404.util;

import lombok.Data;

@Data
public class PageVO {
	//criteria를 받아서 화면에 보여줄 버튼을 계산할 클래스

	private int startPage;	//첫페이지 번호
	private int endPage;	//마지막페이지 번호
	private boolean prev;	//이전버튼
	private boolean next;	//다음
	
	private int pageNum;	//현재 페이지 번호	
	private int amount;		//보여질 데이터개수
	private int total;		//총 게시글 수
	
	//반드시 cri와 total을 전달
	public PageVO(Criteria cri, int total) {
		//번호, 개수, 총 게시글 수 세팅
		this.pageNum = cri.getPageNum();
		this.amount = cri.getAmount();
		this.total = total;
		
		//끝 패이지 계산
		this.endPage = (int)Math.ceil(this.pageNum/10.0) * 10;
		
		//처음 페이지
		this.startPage = endPage - 10 + 1;
		
		//실제 마지막 번호
		//만약 총 게시물이 53개라면 -> 끝 페이지 번호는 6까지 처리
		int realEnd = (int)Math.ceil(this.total / (double)this.amount);
		
		//404개 게시물
		//endPage의 증가 번호는 10,20 30 40 50...
		//realEnd는 41번 페이지
		if(this.endPage > realEnd) {
			this.endPage = realEnd;
		}
		
		//이전버튼
		//시작버튼이 활성화 되는 경우는 11번 페이지부터
		this.prev = startPage > 1;
		
		//다음버튼 활성화 여부
		this.next = realEnd > this.endPage;
		
		
	}
	
}
