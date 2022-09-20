package com.exam.examserver.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exam.examserver.model.Category;
import com.exam.examserver.model.Quiz;

public interface QuizRepository extends JpaRepository<Quiz , Long >{

	public List<Quiz> findBycategory(Category category);
	public List<Quiz> findByActive(Boolean b);
	public List<Quiz> findByCategoryAndActive(Category c, Boolean b);
	
}
