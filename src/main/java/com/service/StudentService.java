package com.service;

import com.model.Student1;
import com.model.Student2;
import com.repository.Student1Repository;
import com.repository.Student2Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@Qualifier("studentService")
public class StudentService {

  @Autowired private Student1Repository student1Repository;

  @Autowired private Student2Repository student2Repository;

  public Student1 saveStudent1(Student1 student1) {
    return student1Repository.save(student1);
  }

  public Student2 saveStudent2(Student2 student2) {
    return student2Repository.save(student2);
  }
}
