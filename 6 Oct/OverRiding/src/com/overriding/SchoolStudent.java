/*
 	Program : Create a Class student which is inherited by college and school student .
 	 		  Override the method calculate average marks.	
 	@Author : Kunal Patil
 	@date : 6 Oct 2022
 */
package com.overriding;

public class SchoolStudent extends Student {

	public SchoolStudent() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SchoolStudent(int id, String name, int sub) {
		super(id, name, sub);
		// TODO Auto-generated constructor stub
	}

	// calculate avg marks
		@Override
		public void calcAvg(double... s) {
			this.avgmarks = (s[0] + s[1] + s[2]) / 3;
		}
}
