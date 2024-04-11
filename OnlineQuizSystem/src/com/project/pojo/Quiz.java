package com.project.pojo;

import java.sql.Timestamp;

public class Quiz {
	private int quizId;
    private String quizTitle;
    private String quizDescription;
    private int createdBy;
    private Timestamp createdAt;
	@Override
	public String toString() {
		return "Quiz [quizId=" + quizId + ", quizTitle=" + quizTitle + ", quizDescription=" + quizDescription
				+ ", createdBy=" + createdBy + ", createdAt=" + createdAt + "]";
	}
	public int getQuizId() {
		return quizId;
	}
	public void setQuizId(int quizId) {
		this.quizId = quizId;
	}
	public String getQuizTitle() {
		return quizTitle;
	}
	public void setQuizTitle(String quizTitle) {
		this.quizTitle = quizTitle;
	}
	public String getQuizDescription() {
		return quizDescription;
	}
	public void setQuizDescription(String quizDescription) {
		this.quizDescription = quizDescription;
	}
	public int getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(int createdBy) {
		this.createdBy = createdBy;
	}
	public Timestamp getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}
	public Quiz(int quizId, String quizTitle, String quizDescription, int createdBy, Timestamp createdAt) {
		super();
		this.quizId = quizId;
		this.quizTitle = quizTitle;
		this.quizDescription = quizDescription;
		this.createdBy = createdBy;
		this.createdAt = createdAt;
	}
	public Quiz() {
		super();
		// TODO Auto-generated constructor stub
	}

}
