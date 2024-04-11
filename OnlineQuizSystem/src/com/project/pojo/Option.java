package com.project.pojo;

public class Option {
	private int optionId;
    private int questionId;
    private String optionText;
    private boolean isCorrectOption;
	public int getOptionId() {
		return optionId;
	}
	public void setOptionId(int optionId) {
		this.optionId = optionId;
	}
	public int getQuestionId() {
		return questionId;
	}
	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}
	public String getOptionText() {
		return optionText;
	}
	public void setOptionText(String optionText) {
		this.optionText = optionText;
	}
	public boolean isCorrectOption() {
		return isCorrectOption;
	}
	public void setCorrectOption(boolean isCorrectOption) {
		this.isCorrectOption = isCorrectOption;
	}
	@Override
	public String toString() {
		return "Option [optionId=" + optionId + ", questionId=" + questionId + ", optionText=" + optionText
				+ ", isCorrectOption=" + isCorrectOption + "]";
	}
	public Option(int optionId, int questionId, String optionText, boolean isCorrectOption) {
		super();
		this.optionId = optionId;
		this.questionId = questionId;
		this.optionText = optionText;
		this.isCorrectOption = isCorrectOption;
	}
	public Option() {
		super();
		// TODO Auto-generated constructor stub
	}


}
