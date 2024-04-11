package com.project.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.project.database.DatabaseConnection;
import com.project.pojo.Question;

public class QuestionDao {
	private Connection connection;



    public Question getQuestionById(int questionId) throws SQLException {
    	connection= DatabaseConnection.create();
        String query = "SELECT * FROM Question WHERE question_id = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, questionId);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                Question question = new Question();
                question.setQuestionId(resultSet.getInt("question_id"));
                question.setQuizId(resultSet.getInt("quiz_id"));
                question.setQuestionText(resultSet.getString("question_text"));
                question.setCreatedAt(resultSet.getTimestamp("created_at"));
                return question;
            }
        }
        return null;
    }
}
