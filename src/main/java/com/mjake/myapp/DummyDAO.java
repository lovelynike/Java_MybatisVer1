package com.mjake.myapp;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class DummyDAO {
	
	@Autowired
	private SqlSession sqlSession;
	// 실제 파일 : mappers/example.쿼리아이디
	// namespace : mappers.example.쿼리아이디
	
	public DummyDTO selectTest() throws Exception {
		return sqlSession.selectOne("com.mjake.selectTest");
	}
	

}
