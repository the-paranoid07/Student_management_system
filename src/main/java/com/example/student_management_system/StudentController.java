package com.example.student_management_system;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
//Here we will define end point of APIs
public class StudentController {

    HashMap<Integer,Student>hashMap=new HashMap<>();
    @PostMapping("/registerStudent")
    public void addStudent(@RequestBody Student student){

        int key=student.getRollNo();
        hashMap.put(key,student);
    }

    @GetMapping("/getStudentInfo")
    public Student getStudent(@RequestParam("rollNo")int rollNo){

        Student student=hashMap.get(rollNo);
        return student;
    }

}
