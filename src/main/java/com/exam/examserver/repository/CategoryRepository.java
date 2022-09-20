package com.exam.examserver.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exam.examserver.model.Category;


public interface CategoryRepository extends JpaRepository<Category,Long>{
      
	
}
