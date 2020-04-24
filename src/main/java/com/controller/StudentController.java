package com.controller;

import com.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
@ComponentScan(basePackages = {"com"})
public class StudentController {

  @Autowired private StudentService studentService;

  @GetMapping("/hello")
  public String hello() {
    return "hello";
  }
}
