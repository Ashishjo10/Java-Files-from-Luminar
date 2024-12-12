package javafeatures;

import java.util.Scanner;

public class Addofnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String option;
      do 
      {
    	  System.out.println("Enter number1:");
    	  int a=sc.nextInt();
    	  System.out.println("Enter number2:");
    	  int b=sc.nextInt();
    	  int c=a+b;
    	  System.out.println("Sum="+c);
    	  System.out.println("Do you want to perform again? Comment yes or no");
    	  option=sc.next();
      }while(option.equalsIgnoreCase("yes"));
      sc.close();
	}
}
