package com.smsapp.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.smsapp.sms.entity.Student;


public interface StudentRepository extends JpaRepository<Student, Long>{

}
