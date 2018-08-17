package com.kgupta.DAO;

import com.kgupta.Entity.Student;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class FakeStudentDaoImp implements StudentDao {

    private static Map<Integer, Student> students;

    static {
        students = new HashMap<Integer, Student>();

        students.put(1,new Student(1, "Aman","CS"));
        students.put(2,new Student(2, "Akshay","ECE"));
        students.put(3,new Student(3, "Armaan","EEE"));
    }

    @Override
    public Collection<Student> getAllStudents(){
        return students.values();
    }

    @Override
    public Student getStudentById(Integer id){
        return students.get(id);
    }

    @Override
    public Student deleteStudentById(Integer id){
        return students.remove(id);
    }

    @Override
    public void updateStudent(Student student){
        Student s = students.get(student.getId());
        s.setCourse(student.getCourse());
        s.setName(student.getName());
        s.setId(student.getId());

        students.put(student.getId() , s);
    }

    @Override
    public void insertStudent(Student student){
        students.put(student.getId() , student);
    }
}
