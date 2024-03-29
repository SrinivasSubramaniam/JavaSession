package test;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
	static boolean isAnagram(String s1, String s2) 
    { 
		char[] str1 = s1.toCharArray();
		char[] str2 = s2.toCharArray();
		
        
        int n1 = str1.length; 
        int n2 = str2.length; 
  
        
        if (n1 != n2) 
            return false; 
  
        
        Arrays.sort(str1); 
        Arrays.sort(str2); 
  
         
        for (int i = 0; i < n1; i++) 
            if (str1[i] != str2[i]) 
                return false; 
  
        return true; 
    } 
  
  
    public static void main(String args[]) 
    { 
    	Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first string:");
        String s1 = sc.nextLine();
        System.out.print("Enter the second string:");
        String s2=  sc.nextLine();	
    	
        if (isAnagram(s1, s2)) 
            System.out.println("The two strings are"
                               + " anagram of each other"); 
        else
            System.out.println("The two strings are not"
                               + " anagram of each other"); 
    } 
}
