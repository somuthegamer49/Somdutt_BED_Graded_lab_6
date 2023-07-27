package com.glearning.lab6.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.glearning.lab6.entity.Student;
import com.glearning.lab6.repository.StudentRepository;
import com.glearning.lab6.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository studentRepository;

	@Override
	public Student createStudent(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public List<Student> getAllStudents() {
		return studentRepository.findAll();
	}

	@Override
	public Student getStudentById(Long id) {
		return studentRepository.findById(id)
				.orElseThrow(() -> new IllegalArgumentException("invalid student id passed"));
	}

	@Override
	public Student updateStudent(Student student, long id) {
		Student tempStudents = studentRepository.findById(id)
				.orElseThrow(() -> new IllegalArgumentException("invalid student id passed"));
		if (tempStudents != null) {
			tempStudents.setFirstName(student.getFirstName());
			tempStudents.setLastName(student.getLastName());
			tempStudents.setCourse(student.getCourse());
			tempStudents.setCountry(student.getCountry());

			return studentRepository.save(tempStudents);
		}
		return null;
	}

	@Override
	public void deleteStudent(Long id) {
		studentRepository.deleteById(id);
	}

}
