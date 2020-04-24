package com.repository;

import com.model.Student2;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Student2Repository extends JpaRepository<Student2, Long> {
}
