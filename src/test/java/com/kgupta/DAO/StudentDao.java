package com.kgupta.DAO;

import com.kgupta.Entity.Student;

import java.util.Collection;

public interface StudentDao {
    Collection<Student> getAllStudents();

    Student getStudentById(Integer id);

    Student deleteStudentById(Integer id);

    void updateStudent(Student student);

    void insertStudent(Student student);
}
