package com.sale_stock_indonesia.exercise.util;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/// This class handle write operations to text files that stores one data element per line
public class LineBasedTextFileWriter {

	private BufferedWriter writer = null;

	// Set Default constructor to be private, to that it can't be called 
	private LineBasedTextFileWriter() {}
	
	// Caller must specifies the line-base text file name they want to write 
	public LineBasedTextFileWriter(String filename) throws IOException {
		writer = new BufferedWriter(new FileWriter(new File(filename)));
	}
	
	public void putLine(String s) throws IOException {
		writer.write(s);
		writer.newLine();
	}
	
	public void close() throws IOException {
		// Reader is activated in constructor, so we are sure it's not NULL  
		writer.close();
	}
	
}
