package com.example.demo.mapper;

import java.util.List;

import com.example.demo.entity.Student;


public interface StudentMapper {
	Student findStudentByUserName(String name);
	List<Student> findStudents();
}
