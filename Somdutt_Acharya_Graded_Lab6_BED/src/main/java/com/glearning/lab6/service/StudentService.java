package com.glearning.lab6.service;

import java.util.List;

import com.glearning.lab6.entity.Student;


public interface StudentService {
	
	Student createStudent(Student student);

    List<Student> getAllStudents();

    Student getStudentById(Long id);

    Student updateStudent(Student student, long id);

    void deleteStudent(Long id);

}
