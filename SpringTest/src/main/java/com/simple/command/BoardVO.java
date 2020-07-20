package com.simple.command;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BoardVO {



	private int num;
	private String big;
	private String small;
	private String title;
	private String receptioner_name;
	private String receptioner_email;
	private String receptioner_phone;
	private String processing;
	private String processor;
	private String regdate;

}

