package com.exam.examserver.service;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exam.examserver.model.Question;
import com.exam.examserver.model.Quiz;
import com.exam.examserver.repository.QuestionRepository;

  
@Service
public class QuestionServiceImpl implements QuestionService {
    
	@Autowired
	  private QuestionRepository questionRepository;
	
	
	@Override
	public Question addQuestion(Question question) {
		// TODO Auto-generated method stub
		return this.questionRepository.save(question);
	}

	@Override
	public Question updateQuestion(Question question) {
		// TODO Auto-generated method stub
		return this.questionRepository.save(question);
	}

	@Override
	public Set<Question> getQuestions() {
		// TODO Auto-generated method stub
		return new HashSet<>(this.questionRepository.findAll());
	}

	@Override
	public Question getQuestion(Long questionId) {
		// TODO Auto-generated method stub
		return this.questionRepository.findById(questionId).get();
	}

	@Override
	public Set<Question> getQuestionsOfQuiz(Quiz quiz) {
		// TODO Auto-generated method stub
		return this.questionRepository.findByQuiz(quiz);
	}

	@Override
	public void deleteQuestion(Long queId) {
		// TODO Auto-generated method stub
		Question question = new Question();
		question.setQuesId(queId);
		this.questionRepository.delete(question);
		
	}

	@Override
	public Question get(Long questionsId) {
		// TODO Auto-generated method stub
		return this.questionRepository.getOne(questionsId);
	}

	

	
}
