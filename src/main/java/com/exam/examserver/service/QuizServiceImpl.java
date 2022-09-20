package com.exam.examserver.service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exam.examserver.model.Category;
import com.exam.examserver.model.Quiz;
import com.exam.examserver.repository.QuizRepository;
@Service
@Transactional
public class QuizServiceImpl implements QuizService {
    
	@Autowired
	private QuizRepository quizrepository;
	
	@Override
	public Quiz addQuiz(Quiz quiz) {
		// TODO Auto-generated method stub
		return this.quizrepository.save(quiz);
	}

	@Override
	public Quiz updateQuiz(Quiz quiz) {
		// TODO Auto-generated method stub
		return this.quizrepository.save(quiz);
	}

	@Override
	public Set<Quiz> getQuizzes() {
		// TODO Auto-generated method stub
		return new HashSet<>(this.quizrepository.findAll());
	}

	@Override
	public Quiz getQuiz(Long quizId) {
		// TODO Auto-generated method stub
		return this.quizrepository.findById(quizId).get();
	}

	@Override
	public void deleteQuiz(Long quizId) {
		// TODO Auto-generated method stub
		Quiz quiz = new Quiz();
		quiz.setQid(quizId);
		this.quizrepository.delete(quiz);
	}
	
	@Override
	public List<Quiz> getQuizzesOfCategory(Category category){
		return this.quizrepository.findBycategory(category);
		
	}
//get active quizzes
	
	@Override
	public List<Quiz> getActiveQuizess() {
		// TODO Auto-generated method stub
		return this.quizrepository.findByActive(true);
	}

	@Override
	public List<Quiz> getActiveQuizzesOfCategory(Category c) {
		// TODO Auto-generated method stub
		return this.quizrepository.findByCategoryAndActive(c, true);
	}

}
