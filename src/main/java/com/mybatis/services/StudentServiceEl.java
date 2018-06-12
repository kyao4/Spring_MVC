package com.mybatis.services;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.mybatis.domain.Student;
import com.mybatis.mappers.StudentMapperEl;
import com.mybatis.util.MyBatisSqlSessionFactory;

public class StudentServiceEl {

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	
	public List<Student> findAllStudents() {
		SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();
		try {
			StudentMapperEl studentMapper = sqlSession.getMapper(StudentMapperEl.class);
			return studentMapper.findAllStudents();
		} finally {
			sqlSession.close();
		}
		
	}
	
}
