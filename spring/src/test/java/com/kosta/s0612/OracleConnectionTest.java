package com.kosta.s0612;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

public class OracleConnectionTest {//����Ŭ ����̹� �׽�Ʈ
	private String driver = "oracle.jdbc.driver.OracleDriver";
	private String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private String user = "scott";
	private String password = "tiger";
	@Test
	public void testConn() throws Exception{
		Class.forName(driver);
		
		try(Connection conn=DriverManager.
				getConnection(url,user,password)){
			System.out.println("DB���Ἲ��"+conn);
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
