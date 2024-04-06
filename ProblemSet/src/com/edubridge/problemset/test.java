package com.edubridge.problemset;

import java.util.HashMap;
import java.util.Map;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		
		   
		        String inputString = "Hello world world Java world Hello";
		        Map<String, Integer> wordFrequencyMap = countWordFrequency(inputString);
		        
		        // Displaying the word frequency
		        for (Map.Entry<String, Integer> entry : wordFrequencyMap.entrySet()) {
		            System.out.println("Word: " + entry.getKey() + ", Frequency: " + entry.getValue());
		        }
		    }
		    
		    public static Map<String, Integer> countWordFrequency(String inputString) {
		        Map<String, Integer> wordFrequencyMap = new HashMap<>();
		        String[] words = inputString.split("\\s+"); // Splitting the input string by whitespace
		        
		        for (String word : words) {
		            // Removing any punctuation marks
		            word = word.replaceAll("[^a-zA-Z0-9]", "");
		            // Converting the word to lowercase to avoid case sensitivity
		            word = word.toLowerCase();
		            
		            // Updating the word frequency map
		            if (word.length() > 0) { // Ignore empty strings
		                wordFrequencyMap.put(word, wordFrequencyMap.getOrDefault(word, 0) + 1);
		            }
		        }
		        
		        return wordFrequencyMap;
		    }
		
	}


