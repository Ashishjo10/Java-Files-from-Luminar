package stringpgms;

import java.util.Scanner;

public class Reversewords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner sc = new Scanner(System.in);
	       
	        System.out.println("Enter a string:");
	        String input = sc.nextLine();
	        
	        String[] words = input.split(" ");
	        
	        System.out.print("Reversed output:");
	        for (int i = words.length - 1; i >= 0; i--) 
	        {
	            System.out.print(words[i] + " ");
	        }
	 sc.close();
		
	}

}
