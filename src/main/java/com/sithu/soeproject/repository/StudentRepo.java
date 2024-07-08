package com.sithu.soeproject.repository;


import com.sithu.soeproject.model.entity.Student;
import com.sithu.soeproject.model.share.StudentShare;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepo extends CrudRepository<Student,Long>
{

    @Query("SELECT new com.sithu.soeproject.model.share.StudentShare("+
            "s.name,"+
            "s.phone,"+
            "s.address)"+
            "From Student s"
    )
    List<StudentShare> getAllStudents();

}
