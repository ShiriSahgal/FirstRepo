package com.project.pojo;

import java.sql.Timestamp;

public class Score {
	private int scoreId;
    private int userId;
    private int quizId;
    private int score;
    private Timestamp attemptedAt;
	public int getScoreId() {
		return scoreId;
	}
	public void setScoreId(int scoreId) {
		this.scoreId = scoreId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getQuizId() {
		return quizId;
	}
	public void setQuizId(int quizId) {
		this.quizId = quizId;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public Timestamp getAttemptedAt() {
		return attemptedAt;
	}
	public void setAttemptedAt(Timestamp attemptedAt) {
		this.attemptedAt = attemptedAt;
	}
	@Override
	public String toString() {
		return "Score [scoreId=" + scoreId + ", userId=" + userId + ", quizId=" + quizId + ", score=" + score
				+ ", attemptedAt=" + attemptedAt + "]";
	}
	public Score(int scoreId, int userId, int quizId, int score, Timestamp attemptedAt) {
		super();
		this.scoreId = scoreId;
		this.userId = userId;
		this.quizId = quizId;
		this.score = score;
		this.attemptedAt = attemptedAt;
	}
	public Score() {
		super();
		// TODO Auto-generated constructor stub
	}
}
