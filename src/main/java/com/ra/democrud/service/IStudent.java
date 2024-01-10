package com.ra.democrud.service;

import com.ra.democrud.model.Student;

import java.util.List;

public interface IStudent {
    List<Student> findAll();
    Student findByID(Long id);
    void save(Student student);
    void deleteById(Long id);



}
