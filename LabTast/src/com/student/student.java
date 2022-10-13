package com.student;

public class student {

	
		static void Student(String Name, int Id) throws CustomException {
			
			if (Name == null || Id == 0) {
				
				throw new CustomException(Name, Id);
			}
			
			else {
				
				System.out.println("Student name is : " + Name);
				System.out.println("Student Id is : " + Id);
			}
		}

		
		public static void main(String[] args) throws CustomException {
			
			String Name = "Kunal";
			int Id = 101;

			
			Student(Name, Id);

		}

}
