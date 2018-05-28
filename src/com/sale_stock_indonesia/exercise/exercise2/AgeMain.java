package com.sale_stock_indonesia.exercise.exercise2;

import java.io.IOException;

import com.sale_stock_indonesia.exercise.exercise2.exception.IncorrectAgeException;

public class AgeMain {

	public static void main(String[] args) {
		System.out.println("The input of this application is \"age.txt\", which is a text file that store people's age line by line."); 
		System.out.println("This application sorts those ages, and store the resulting value at a text file called \"stored_aged.txt\""); 

		AgeSortAPI ageSortAPI = new AgeSortAPI();
		try {
			ageSortAPI.process();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (IncorrectAgeException e) {
			e.printStackTrace();
		}

		System.out.println("\n--Done--"); 
	}
	
	
	/// calculatedProductScore = rawProductScore * 0.95 ^ daysPassed;
	/// ln(calculatedProductScore) = ln(rawProductScore) + daysPassed*ln(0.95)
	/// calculatedProductScore = exp(ln(rawProductScore)+daysPassed*ln(0.95));
	
}
