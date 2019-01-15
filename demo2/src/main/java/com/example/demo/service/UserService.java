package com.example.demo.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;
import com.example.demo.mapper.StudentMapper;



@Service
public class UserService {

	@Autowired
	private StudentMapper studentMapper;

	public Student findUserById(String name) {
		return studentMapper.findStudentByUserName(name);
	}

	public List<Student> findUserList() {
		return studentMapper.findStudents();
	}

	
}
