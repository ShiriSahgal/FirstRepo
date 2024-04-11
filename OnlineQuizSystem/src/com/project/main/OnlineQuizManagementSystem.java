package com.project.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.project.dao.OptionDao;
import com.project.dao.QuestionDao;
import com.project.dao.QuizDao;
import com.project.dao.ScoreDao;
import com.project.dao.UserDao;
import com.project.database.DatabaseConnection;
import com.project.pojo.Option;
import com.project.pojo.Question;
import com.project.pojo.Quiz;
import com.project.pojo.User;

public class OnlineQuizManagementSystem {
	

	public static  void main(String[] args) {
		// TODO Auto-generated method stub
		try {
            // Establish connection
        
            System.out.println("Connected to the database!");

            // Create DAO instances
            UserDao userDAO = new UserDao();
            QuizDao quizDAO = new QuizDao();
            QuestionDao questionDAO = new QuestionDao();
            OptionDao optionDAO = new OptionDao();
            ScoreDao scoreDAO = new ScoreDao();

            String username =null;
			// Example usage of DAO methods
            User user = userDAO.getUserByUsername(username);
            if (user != null) {
                System.out.println("User found: " + user);
            } else {
                System.out.println("User not found!");
            }

            Quiz quiz = quizDAO.getQuizById(1);
            if (quiz != null) {
                System.out.println("Quiz found: " + quiz);
            } else {
                System.out.println("Quiz not found!");
            }

            Question question = questionDAO.getQuestionById(1);
            if (question != null) {
                System.out.println("Question found: " + question);
            } else {
                System.out.println("Question not found!");
            }

            Option option = optionDAO.getOptionById(1);
            if (option != null) {
                System.out.println("Option found: " + option);
            } else {
                System.out.println("Option not found!");
            }

            // Close connection
           
            System.out.println("Connection closed.");
        } catch (SQLException e) {
            // Handle any SQL errors
            e.printStackTrace();
        }
		
	}

}
