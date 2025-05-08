package com.taller.diego.repository;

import com.taller.diego.entity.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {}