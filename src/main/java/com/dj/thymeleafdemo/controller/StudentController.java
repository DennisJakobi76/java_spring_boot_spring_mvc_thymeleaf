package com.dj.thymeleafdemo.controller;


import org.springframework.ui.Model;
import com.dj.thymeleafdemo.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class StudentController {

    @GetMapping("/showStudentForm")
    public String showForm(Model theModel){

        // create a new student object
        Student theStudent = new Student();

        // add student object to the model
        theModel.addAttribute("student", theStudent);


        return "student-form";
    }

    @PostMapping("/processStudentForm")
    public String processForm(@ModelAttribute("student") Student theStudent){

        // log the  input data
        System.out.println("theStudent: " + theStudent.getFirstName() + " " + theStudent.getLastName());
        System.out.println("Country: " + theStudent.getCountry());


        return "student-confirmation";
    }
}
