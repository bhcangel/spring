package com.simple.basic;

import java.sql.Connection;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)	//스프링프레임워크에서 독립적으로 테스트환경을 가동
@ContextConfiguration("file:src/main/webapp/WEB-INF/config/root-context.xml")	//해당 파일을 스프링 설정파일로 적용
public class JDBCHikari {
	
	//커넥션 풀 확인
	@Autowired
	javax.sql.DataSource dataSource;		//root-context의 "dataSource" 빈이 들어옴
	
	//스프링 jdbc확인
	@Autowired
	JdbcTemplate jdbcTemplate;			//root-context의 "jdbcTemplate" 빈
	
	@Test
	public void test() {
		
		try {

			Connection conn = dataSource.getConnection();
			
			System.out.println("결과 확인 " + jdbcTemplate);
			
			System.out.println("결과확인 : " + conn);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
