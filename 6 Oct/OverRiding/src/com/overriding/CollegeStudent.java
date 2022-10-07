/*
 	Program : Create a Class student which is inherited by college and school student .
 	 		  Override the method calculate average marks.	
 	@Author : Kunal patil
 	@date : 6 Oct 2022
 */
package com.overriding;

public class CollegeStudent extends Student {
	// no Argument  constructor
	public CollegeStudent() {
		super();
		// TODO Auto-generated constructor stub
	}
	// parameterized constructor
	public CollegeStudent(int id, String name, int sub) {
		super(id, name, sub);
		// TODO Auto-generated constructor stub
	}

	// calculate avg marks
		@Override
		public void calcAvg(double... s) {
			this.avgmarks = (s[0] + s[1] + s[2] + s[3] + s[4]) / 5;
		}
}
