package com.manytomany.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.manytomany.entity.Student;

public interface StudentRepository extends JpaRepository<Student,Integer> {

}
