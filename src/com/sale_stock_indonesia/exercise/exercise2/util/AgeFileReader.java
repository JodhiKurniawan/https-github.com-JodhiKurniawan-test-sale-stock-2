package com.sale_stock_indonesia.exercise.exercise2.util;

import java.io.FileNotFoundException;
import java.io.IOException;

import com.sale_stock_indonesia.exercise.util.LineBasedTextFileReader;

/// This class handle read operations to text files that stores age information per line. 
/// The age information is a textual representation of an integer
public class AgeFileReader extends LineBasedTextFileReader {

	public AgeFileReader(String filename) throws FileNotFoundException {
		super(filename);
	}
	
	public Integer getIntegerLine() throws IOException {
		String line = getLine();
		return (line == null) ? null : Integer.parseInt(line);
	}
}
