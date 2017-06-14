package com.kosta.s0612;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

public class OracleConnectionTest {//오라클 드라이버 테스트
	private String driver = "oracle.jdbc.driver.OracleDriver";
	private String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private String user = "scott";
	private String password = "tiger";
	@Test
	public void testConn() throws Exception{
		Class.forName(driver);
		
		try(Connection conn=DriverManager.
				getConnection(url,user,password)){
			System.out.println("DB연결성공"+conn);
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
