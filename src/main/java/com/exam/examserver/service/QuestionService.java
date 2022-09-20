package com.exam.examserver.service;

import java.util.Set;

import com.exam.examserver.model.Question;
import com.exam.examserver.model.Quiz;

public interface QuestionService {
    
	public Question addQuestion(Question question);
	
	public Question updateQuestion(Question question);
	
	public Set<Question> getQuestions();
	
	public Question getQuestion(Long questionId);
	
	public Set<Question> getQuestionsOfQuiz(Quiz quiz);
	
	public void deleteQuestion(Long quesId);
	
	public Question get(Long questionsId);
	
}

