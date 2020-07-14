package com.team404.command;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data		//게터세터 자동 생성
@NoArgsConstructor
@AllArgsConstructor
public class FreeBoardVO {
	
	private int bno;
	private String title;
	private String writer;
	private String content;
	private Timestamp regdate;
	private Timestamp updatedate;

}
