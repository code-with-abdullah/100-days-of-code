package org.code_with_abdullah.Controller;

import org.code_with_abdullah.Entity.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @GetMapping("/get")
    public Student getStudent(){
        return new Student("Alien", "Java", 20);
    }

    @GetMapping("/all")
    public List<Student> getStudents() {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Sam", "Jane", 20));
        students.add(new Student("Mat", "Kim", 21));
        students.add(new Student("Samantha", "Kane", 22));
        students.add(new Student("Trance", "Luke", 23));
        students.add(new Student("Fringe", "Jack", 23));
        return students;
    }
}
