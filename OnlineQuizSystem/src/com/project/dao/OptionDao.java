package com.project.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.project.database.DatabaseConnection;
import com.project.pojo.Option;

public class OptionDao {
	private Connection connection;

 

    public Option getOptionById(int optionId) throws SQLException {
    	connection= DatabaseConnection.create();
        String query = "SELECT * FROM optn WHERE option_id = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, optionId);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                Option option = new Option();
                option.setOptionId(resultSet.getInt("option_id"));
                option.setQuestionId(resultSet.getInt("question_id"));
                option.setOptionText(resultSet.getString("option_text"));
                option.setCorrectOption(resultSet.getBoolean("is_correct_option"));
                return option;
            }
        }
        return null;
    }

}
