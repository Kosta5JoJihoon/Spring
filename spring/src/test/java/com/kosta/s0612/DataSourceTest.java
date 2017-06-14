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
// ===> Web���� ���� ���� ��ġ �������� ����Ǵ� �� ó�� �����׽�Ʈ(�κ��׽�Ʈ)�� �����Ҽ� ���� 
public class DataSourceTest {//��ȯ�濡���� DataSources(ConnectionPool)�׽�Ʈ
	
	@Inject //root-context.xml�� ��ϵ� ������ Ŭ������ü�� ���� 
	private DataSource ds; //ConnectionPool
	
	@Test
	public void testConnection() throws Exception{
		Connection conn = ds.getConnection();
		System.out.println("DB���Ἲ��(conn) = "+conn);
	}
	

}
