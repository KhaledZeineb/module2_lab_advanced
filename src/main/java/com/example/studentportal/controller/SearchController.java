package com.example.studentportal.controller;

import com.example.studentportal.model.Student;
import com.example.studentportal.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class SearchController {

    private final StudentService studentService;

    @Autowired
    public SearchController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/search")
    public String searchPage() {
        return "search";
    }

    @GetMapping("/search/results")
    public String searchResults(@RequestParam(required = false) String query, Model model) {
        List<Student> students;

        if (query != null && !query.isEmpty()) {
            students = studentService.searchStudents(query);
            model.addAttribute("searchQuery", query);
        } else {
            students = studentService.getAllStudents();
        }

        model.addAttribute("students", students);
        return "search-results";
    }
}