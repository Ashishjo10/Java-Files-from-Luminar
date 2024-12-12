package stringpgms;

import java.util.Scanner;

public class Vowelcount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
	    Vowelcount vr=new Vowelcount();
	    vr.vowel(sc);
	}

	public void vowel(Scanner sc)
	{
		int count=0;
		System.out.println("Enter the string");
		String s=sc.nextLine();
		s=s.toLowerCase();
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				count++;
			}
			
		}
		System.out.println("Total no of vowels="+count);
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
