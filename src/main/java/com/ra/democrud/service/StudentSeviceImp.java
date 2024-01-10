package com.ra.democrud.service;

import com.ra.democrud.dao.IStudentDao;
import com.ra.democrud.dao.StudentDaoImp;
import com.ra.democrud.model.Student;

import java.util.List;

public class StudentSeviceImp implements IStudent {
    private static IStudentDao studentDao = new StudentDaoImp();

    @Override
    public List<Student> findAll() {
        return studentDao.findAll();
    }

    @Override
    public Student findByID(Long id) {
        return studentDao.findByID(id);
    }

    @Override
    public void save(Student student) {
        studentDao.save(student);
    }

    @Override
    public void deleteById(Long id) {
        studentDao.deleteById(id);
    }
}
