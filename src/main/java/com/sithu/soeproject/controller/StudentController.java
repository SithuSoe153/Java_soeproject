package com.sithu.soeproject.controller;

import com.sithu.soeproject.model.entity.Student;
import com.sithu.soeproject.model.share.StudentShare;
import com.sithu.soeproject.service.StudentService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("v1/project")
@AllArgsConstructor
@Slf4j
public class StudentController
{

    private final StudentService studentService;

    @GetMapping("/students")
    public List<StudentShare> getAllStudents(){
        return studentService.getAllStudents();
    }

//    @PostMapping("/students")
//    public ResponseEntity<Student> createStudent(@RequestBody Student student){
//        Student createStudent=studentService.createStudent(student);
//        return ResponseEntity.ok(createStudent);
//    }



}
