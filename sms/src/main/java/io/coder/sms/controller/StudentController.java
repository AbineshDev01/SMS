package io.coder.sms.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import io.coder.sms.model.Student;
import io.coder.sms.service.StudentService;
import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class StudentController {
    
    private final StudentService studentService;

    @GetMapping("/")
    public String listStudents(Model model) {
        List<Student> students = studentService.getAllStudents();
        model.addAttribute("students", students);
        return "index";
    }

    @PostMapping("/add-student")
    public String addStudent(@ModelAttribute Student student, Model model) {
        Student savedStudent = studentService.saveStudent(student);
        model.addAttribute("student", savedStudent);
        return "redirect:/";
    }

    @GetMapping("/add-student/form")
    public String addStudentForm(Model model) {
        model.addAttribute("student", new Student());
        return "add_form";
    }

    @GetMapping("/edit-form/{studentId}")
    public String getEditForm(@PathVariable Long studentId, Model model) {
        model.addAttribute("student", studentService.getStudent(studentId));
        return "edit_form";
    }

    @PostMapping("/edit-student/{studentId}")
    public String updateStudent(@PathVariable Long studentId, @ModelAttribute Student student) {
        studentService.updateStudent(studentId, student);
        return "redirect:/";
    }

    @GetMapping("/delete-student/{studentId}")
    public String deleteStudent(@PathVariable Long studentId) {
        studentService.deleteStudent(studentId);
        return "redirect:/";
    }
}
