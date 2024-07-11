package io.coder.sms.service;

import java.util.List;

import org.springframework.stereotype.Service;

import io.coder.sms.dao.StudentRepository;
import io.coder.sms.exception.StudentNotFoundException;
import io.coder.sms.model.Student;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class StudentService {

    private final StudentRepository studentRepository;

    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public Student getStudent(Long id) {
        return studentRepository.findById(id).orElseThrow(() -> new StudentNotFoundException("Student not found with ID: " + id));
    }

    public Student updateStudent(Long id, Student student) {
        Student existingStudent = studentRepository.findById(id).orElseThrow(() -> new StudentNotFoundException("Student not found with ID: " + id));

        if(student.getFirstName() != null) existingStudent.setFirstName(student.getFirstName());
        if(student.getLastName() != null) existingStudent.setLastName(student.getLastName());
        if(student.getGender() != null) existingStudent.setGender(student.getGender());
        if(student.getDob() != null) existingStudent.setDob(student.getDob());
        if(student.getEmail() != null) existingStudent.setEmail(student.getEmail());
        if(student.getPhoneNumber() != null) existingStudent.setPhoneNumber(student.getPhoneNumber());

        return studentRepository.save(existingStudent);
    }

    public void deleteStudent(Long id) {
        Student student = studentRepository.findById(id).orElseThrow(() -> new StudentNotFoundException("Student not found with ID: " + id));
        studentRepository.delete(student);
    }
}
