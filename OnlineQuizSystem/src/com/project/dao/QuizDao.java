package com.project.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.project.database.DatabaseConnection;
import com.project.pojo.Quiz;

public class QuizDao {
	private Connection connection;

 

    public Quiz getQuizById(int quizId) throws SQLException {
    	connection= DatabaseConnection.create();
        String query = "SELECT * FROM quiz WHERE quiz_id = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, quizId);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                Quiz quiz = new Quiz();
                quiz.setQuizId(resultSet.getInt("quiz_id"));
                quiz.setQuizTitle(resultSet.getString("quiz_title"));
                quiz.setQuizDescription(resultSet.getString("quiz_description"));
                quiz.setCreatedBy(resultSet.getInt("created_by"));
                quiz.setCreatedAt(resultSet.getTimestamp("created_at"));
                return quiz;
            }
        }
        return null;
    }

}
