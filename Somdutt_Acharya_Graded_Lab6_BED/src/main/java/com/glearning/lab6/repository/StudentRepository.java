package com.glearning.lab6.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.glearning.lab6.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
