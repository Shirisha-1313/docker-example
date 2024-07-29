package com.ust.docker_example.service;

import com.ust.docker_example.model.Student;
import com.ust.docker_example.repository.Studentrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Studentservice {
    @Autowired
    private Studentrepository repo;
    public Student addStudent(Student student){
        return repo.save(student);

    }
    public List<Student> getAll(){
        return repo.findAll();
    }
}
