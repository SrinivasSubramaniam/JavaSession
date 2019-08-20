package test;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String s1, s2 = "";
	        Scanner s = new Scanner(System.in);
	        System.out.print("Enter the string:");
	        s1 = s.nextLine();
	        
	        for(int i = s1.length() - 1; i >= 0; i--)
	        {
	            s2 = s2 + s1.charAt(i);
	        }
	        if(s1.equalsIgnoreCase(s2))
	        {
	            System.out.println("Entered string is palindrome.");
	        }
	        else
	        {
	            System.out.println("Entered string is not palindrome.");
	        }

	}

}
