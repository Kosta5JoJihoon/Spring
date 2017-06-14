package com.kosta.s0612;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.kosta.myapp.Emp;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"})
public class MyBatisTest {//MyBatis 연동테스트
	
	@Inject
	private SqlSessionFactory factory; 
	
	@Test
	public void testFactory() throws Exception{
		System.out.println("factory객체 주입 성공 여부---> "+factory);
	}
	
	@Test
	public void testSession() throws Exception{
		SqlSession sqlMap = factory.openSession();
		//SqlSession == SqlMapClient sqlMap;
		System.out.println("XML문서 내의 sql호출 가능 여부 --->"+sqlMap);
	}
	
//	@Test
	public void testInsert(){
		SqlSession sqlMap = factory.openSession();
		System.out.println("사원입력: "+sqlMap.insert("test.insert"));
	}
	//@Test
	public void testParamInsert(){
		SqlSession sqlMap = factory.openSession();
		
//		Map<String, Object> map = new HashMap<>();
//			map.put("empno", 8002);
//			map.put("ename", "길라임");
//			map.put("sal", 2900);
//			sqlMap.insert("test.insert2",map);
		
		Emp emp = new Emp(8004, "김주원", 2600);
		sqlMap.insert("test.insert2",emp);
		
	}
 	@Test
	public void selEname() throws Exception{
		SqlSession sqlSession = factory.openSession();
		String ename = sqlSession.selectOne("test.selEname");
		System.out.println("사원명 : "+ename);
	}
	
	@Test
	public void selEmp() throws Exception{
		SqlSession sqlSession = factory.openSession();
		int deptno = 30;
		List<Emp> list = sqlSession.selectList("test.selEmp",deptno);
		System.out.println("<"+deptno+"번 부서 사원정보>");
		for (int i=0; i<list.size(); i++){
			System.out.println(list.get(i));
		}
	}
	
}
