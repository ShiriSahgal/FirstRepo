package com.manytomany.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.manytomany.entity.Project;

public interface ProjectRepository  extends JpaRepository<Project,Integer>{

}
