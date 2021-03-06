package com.kgupta.Controller;

import com.kgupta.Entity.Student;
import com.kgupta.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.MediaType;

import javax.print.attribute.standard.Media;
import java.awt.*;
import java.util.Collection;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private  StudentService studentService;

    @RequestMapping(method = RequestMethod.GET)
    public Collection<Student> getAllStudents(){
        return studentService.getAllStudents();
    }

    @RequestMapping(value = "/{id}" , method = RequestMethod.GET)
    public Student getStudentById(@PathVariable("id") Integer id){
        return studentService.getStudentById(id);
    }

    @RequestMapping(value = "/{id}" , method = RequestMethod.DELETE)
    public Student deleteStudentById(@PathVariable("id") Integer id){
        return studentService.deleteStudentById(id);
    }

    @RequestMapping(method = RequestMethod.PUT , consumes = MediaType.APPLICATION_JSON_VALUE)
    public void updateStudentById(@RequestBody Student student){
        studentService.updateStudent(student);
    }

    @RequestMapping(method = RequestMethod.POST , consumes = MediaType.APPLICATION_JSON_VALUE)
    public void insertStudent(@RequestBody Student student){
        studentService.insertStudent(student);
    }

}
