package javafeatures;

import java.util.Scanner;

public class PalindromeSC {

	public static void main(String[] args) {
		String rev="";
		Scanner sc=new Scanner(System.in);
		String ed=sc.next();
		for(int i=ed.length()-1;i>=0;i--)
		{
			rev=rev+ed.charAt(i);
			
		}
		if(ed.equals(rev))
			System.out.println(ed+" is a palidrome");
		else
			System.out.println(ed+" is not a palindrome");
		
sc.close();
	}

}
