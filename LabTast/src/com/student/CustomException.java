package com.student;

public class CustomException extends Exception {

	CustomException(String name, int id) {
		// if name string is null
		if (name == null) {
			// print name not found
			System.out.println("Name not found.");
		}
		// if id is 0
		if (id == 0) {
			// print id not found
			System.out.println("Id not found");
		}
	}
}
