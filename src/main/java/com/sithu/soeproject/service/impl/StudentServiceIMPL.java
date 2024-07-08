package com.sithu.soeproject.service.impl;

import com.sithu.soeproject.model.share.StudentShare;
import com.sithu.soeproject.repository.StudentRepo;
import com.sithu.soeproject.service.StudentService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
@Slf4j

public class StudentServiceIMPL implements StudentService
{
    private final StudentRepo studentRepo;

    public List<StudentShare> getAllStudents()
    {
        return studentRepo.getAllStudents();
    }

//    @Override
//    public Student createStudent(Student student) {
//        return studentReop.save(student);
//    }

}
