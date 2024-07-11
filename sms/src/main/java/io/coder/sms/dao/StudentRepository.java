package io.coder.sms.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import io.coder.sms.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
