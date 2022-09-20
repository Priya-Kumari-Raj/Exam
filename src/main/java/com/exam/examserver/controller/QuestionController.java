package com.exam.examserver.controller;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exam.examserver.model.Question;
import com.exam.examserver.model.Quiz;
import com.exam.examserver.service.QuestionService;
import com.exam.examserver.service.QuizService;


@RestController
@CrossOrigin("*")
@RequestMapping("/question")
public class QuestionController {

	@Autowired
	private QuestionService service;
	
	@Autowired
	private QuizService quizService;
	
	//add question
	@PostMapping("/")
	public ResponseEntity<Question> add(@RequestBody Question question){
		return ResponseEntity.ok(this.service.addQuestion(question));
	}
	
	//update the question
	public ResponseEntity<Question> update(@RequestBody Question question)
	{
		return ResponseEntity.ok(this.service.updateQuestion(question));
	}
	
	//get all question of ant quid
	@GetMapping("/quiz/{qid}")
	public ResponseEntity<?> getQuestionOfQuiz(@PathVariable("qid") Long qid){
		Quiz quiz = new Quiz();
		quiz.setQid(qid);
		Set<Question> questionsOfQuiz = this.service.getQuestionsOfQuiz(quiz);
		return ResponseEntity.ok(questionsOfQuiz);
	}
//		Quiz quiz = this.quizService.getQuiz(qid);
//		Set<Question> questions = quiz.getQuestions();
//		List<Question> list = new ArrayList(questions);
//		if(list.size()>Integer.parseInt(quiz.getNumberOfQuestions()));
//		{
//			list = list.subList(0, Integer.parseInt(quiz.getNumberOfQuestions()+1));
//		}
//		
//		list.forEach((q)->{
//		q.setAnswer("");
//		});
//		
//		Collections.shuffle(list);
//		return ResponseEntity.ok(list);
//	} 
	
	//get single question
	@GetMapping("/{quesId}")
	public Question get(@PathVariable("quesId") Long quesId) {
		return this.service.getQuestion(quesId);
	}
	
	//delete question
	@DeleteMapping("/{quesId}")
	public void delete(@PathVariable("quesId")Long quesId) {
		this.service.deleteQuestion(quesId);
	}
	
	//eval quiz
	@PostMapping("/eval-quiz")
	public ResponseEntity<?> evalQuiz(@RequestBody List<Question> questions){
	System.out.println(questions);
	double marksGot =0;
	int correctAnswers = 0;
	int attempted = 0;
	for(Question q : questions){

	//single questions
	Question question = this.service.get(q.getQuesId());
	if(question.getAnswer().equals(q.getGivenAnswer()))
	{
	//correct
	correctAnswers++;

	double marksSingle = Double.parseDouble(questions.get(0).getQuiz().getMaxMarks())/questions.size();
	//this.questions[0].quiz.maxMraks/this.questions.length;
	marksGot +=marksSingle;
	}
	if(q.getGivenAnswer()!=null){
	attempted++;
	}



	}
	Map<String, Object> map =Map.of("marksGot",marksGot, "correctAnswers",correctAnswers, "attempted",attempted);
	return ResponseEntity.ok(map);
	}
	}

