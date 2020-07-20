package com.simple.command;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BoardVO2 {
	private int num;
	private String answer;
	private Timestamp answerdate;
	private String processingstatus;
	private String managerid;
	private String memo;

}
