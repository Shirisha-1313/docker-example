package com.ust.docker_example.controller;
import com.ust.docker_example.model.Student;
import com.ust.docker_example.service.Studentservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Studentcontroller {
    @Autowired
    private Studentservice service;
    @PostMapping("/add")
    public Student addStudent(Student student){
        return service.addStudent(student);
    }
    @GetMapping("/getAll")
    public List<Student> getStudentList(){
        return service.getAll();
    }
}
