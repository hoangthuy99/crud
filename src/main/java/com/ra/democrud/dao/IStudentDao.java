package com.ra.democrud.dao;

import com.ra.democrud.model.Student;

import java.util.List;

public interface IStudentDao {
    List<Student> findAll();
    Student findByID(Long id);
    void save(Student student);
    void deleteById(Long id);



}
