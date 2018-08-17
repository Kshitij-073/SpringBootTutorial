package com.kgupta.Service;

import com.kgupta.DAO.FakeStudentDaoImp;
import com.kgupta.Entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class StudentService {

    @Autowired
    private FakeStudentDaoImp fakeStudentDaoImp;

    public Collection<Student> getAllStudents(){
        return fakeStudentDaoImp.getAllStudents();
    }

    public Student getStudentById(Integer id){
        return fakeStudentDaoImp.getStudentById(id);
    }

    public Student deleteStudentById(Integer id){
        return fakeStudentDaoImp.deleteStudentById(id);
    }

    public void updateStudent(Student student){
        fakeStudentDaoImp.updateStudent(student);
    }

    public void insertStudent(Student student){
        fakeStudentDaoImp.insertStudent(student);
    }
}
