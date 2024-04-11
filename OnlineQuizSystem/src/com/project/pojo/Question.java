package com.project.pojo;

import java.sql.Timestamp;

public class Question {
	private int questionId;
    private int quizId;
    private String questionText;
    private Timestamp createdAt;
	public int getQuestionId() {
		return questionId;
	}
	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}
	public int getQuizId() {
		return quizId;
	}
	public void setQuizId(int quizId) {
		this.quizId = quizId;
	}
	public String getQuestionText() {
		return questionText;
	}
	public void setQuestionText(String questionText) {
		this.questionText = questionText;
	}
	public Timestamp getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}
	@Override
	public String toString() {
		return "Question [questionId=" + questionId + ", quizId=" + quizId + ", questionText=" + questionText
				+ ", createdAt=" + createdAt + "]";
	}
	public Question(int questionId, int quizId, String questionText, Timestamp createdAt) {
		super();
		this.questionId = questionId;
		this.quizId = quizId;
		this.questionText = questionText;
		this.createdAt = createdAt;
	}
	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}

}
