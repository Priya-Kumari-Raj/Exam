package com.exam.examserver.repository;

import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exam.examserver.model.Question;
import com.exam.examserver.model.Quiz;

public interface QuestionRepository extends JpaRepository<Question , Long>{

	Set<Question> findByQuiz(Quiz quiz);

}
