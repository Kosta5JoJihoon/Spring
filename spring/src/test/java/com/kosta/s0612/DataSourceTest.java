package com.kosta.s0612;

import java.sql.Connection;

import javax.inject.Inject;
import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"})
// ===> Web서버 실행 없이 마치 웹서버가 실행되는 것 처럼 단위테스트(부분테스트)를 실행할수 있음 
public class DataSourceTest {//웹환경에서의 DataSources(ConnectionPool)테스트
	
	@Inject //root-context.xml에 등록된 생성된 클래스객체를 주입 
	private DataSource ds; //ConnectionPool
	
	@Test
	public void testConnection() throws Exception{
		Connection conn = ds.getConnection();
		System.out.println("DB연결성공(conn) = "+conn);
	}
	

}
