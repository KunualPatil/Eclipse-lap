package Quation2;

import java.util.Scanner;

public class EvenOdd {
	
static void num(int...EvenOdd) {
		  
		   for(int i : EvenOdd)
		   {
			   System.out.print(i+ "  ");
		   }
		    System.out.println(" Number is ");
	  
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// input method
		
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // if condition
        
        if(num % 2 == 0)
            System.out.println(num + " is even");
        // Else condition
        else
            System.out.println(num + " is odd");
    }

}
