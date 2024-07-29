package com.ust.docker_example.repository;

import com.ust.docker_example.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Studentrepository extends JpaRepository<Student,Integer> {
}
