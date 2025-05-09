package com.example.studentportal.service;

import com.example.studentportal.model.Student;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface StudentService {
    List<Student> getAllStudents();

    Optional<Student> getStudentById(Long id);

    Student saveStudent(Student student);

    void deleteStudent(Long id);

    // Nouvelles méthodes de recherche
    List<Student> searchStudentsByName(String name);

    List<Student> searchStudentsByCourse(String course);

    List<Student> searchStudents(String query);
}