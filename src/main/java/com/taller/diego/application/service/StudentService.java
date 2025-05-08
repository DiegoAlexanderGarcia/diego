package com.taller.diego.application.service;

import com.taller.diego.entity.domain.Student;
import com.taller.diego.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    public Optional<Student> findById(Long id) {
        return studentRepository.findById(id);
    }

    public Student save(Student student) {
        return studentRepository.save(student);
    }

    public Student update(Long id, Student updatedStudent) {
        return studentRepository.findById(id)
                .map(student -> {
                    student.setFirstname(updatedStudent.getFirstname());
                    student.setLastname(updatedStudent.getLastname());
                    student.setEmail(updatedStudent.getEmail());
                    student.setCelphone(updatedStudent.getCelphone());
                    student.setSchool(updatedStudent.getSchool());
                    return studentRepository.save(student);
                })
                .orElseThrow(() -> new RuntimeException("Student not found"));
    }

    public void delete(Long id) {
        studentRepository.deleteById(id);
    }
}