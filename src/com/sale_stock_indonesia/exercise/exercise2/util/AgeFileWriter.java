package com.sale_stock_indonesia.exercise.exercise2.util;

import java.io.IOException;

import com.sale_stock_indonesia.exercise.util.LineBasedTextFileWriter;

/// This class handle write operations to text files that stores age information per line. 
/// The age information is a textual representation of an integer
public class AgeFileWriter extends LineBasedTextFileWriter {

	public AgeFileWriter(String filename) throws IOException {
		super(filename);
	}

	public void writeIntegerLine(int value) throws IOException {
		this.putLine(new Integer(value).toString());
	}
}
