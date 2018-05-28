package com.sale_stock_indonesia.exercise.exercise2;

import java.io.IOException;

import com.sale_stock_indonesia.exercise.exercise2.exception.IncorrectAgeException;
import com.sale_stock_indonesia.exercise.exercise2.util.AgeFileReader;
import com.sale_stock_indonesia.exercise.exercise2.util.AgeFileWriter;



/// We can't possibly save the age 7 Billion People in 1 GB of RAM
/// However, since age's type is integer, there's still a way to do it
/// We can define valid range of age is [0..200], since we can say it's impossible to find living pepople aged more than 200 years old
/// So, the idea is, we maintain an array indexed by age, recording the number of people at that age
public class AgeSortAPI  {
	
	private static final int MAX_AGE = 200;
	private static final String INPUT_FILE_NAME = "age.txt";
	private static final String OUTPUT_FILE_NAME = "sorted_age.txt";
	
	int[] arrayNumberOfPopulationByAge = new int[MAX_AGE];
	
	private void initArray() {
		for (int i = 0; i < arrayNumberOfPopulationByAge.length; i++) {
			arrayNumberOfPopulationByAge[i] = 0;
		}
	}

	public AgeSortAPI()  {
		initArray();
	}
	
	public void process() throws IOException, IncorrectAgeException {
		initArray();
		AgeFileReader reader = new AgeFileReader(INPUT_FILE_NAME);
		Integer age;
		while ((age = reader.getIntegerLine()) != null) {
			if ((age < 0) || (age >= MAX_AGE)) {
				throw new IncorrectAgeException(age); 
			}
			arrayNumberOfPopulationByAge[age]++;
		}
		reader.close();
		AgeFileWriter writer = new AgeFileWriter(OUTPUT_FILE_NAME);
		for (int i = 0; i < arrayNumberOfPopulationByAge.length; i++) {
			for (int j = 0; j < arrayNumberOfPopulationByAge[i]; j++) {
				writer.writeIntegerLine(i);
			}
		}
		writer.close();
	}

}
