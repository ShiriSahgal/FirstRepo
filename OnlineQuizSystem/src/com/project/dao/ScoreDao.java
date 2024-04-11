package com.project.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.project.database.DatabaseConnection;
import com.project.pojo.Score;

public class ScoreDao {
	private Connection connection;



    public void addScore(Score score) throws SQLException {
    	connection= DatabaseConnection.create();
        String query = "INSERT INTO score (user_id, quiz_id, score, attempted_at) VALUES (?, ?, ?, ?)";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, score.getUserId());
            statement.setInt(2, score.getQuizId());
            statement.setInt(3, score.getScore());
            statement.setTimestamp(4, score.getAttemptedAt());
            statement.executeUpdate();
        }
    }

}
