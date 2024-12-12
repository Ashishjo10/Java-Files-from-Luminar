package javafeatures;

import java.util.Scanner;

public class PalindromeNumSC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rev=0;
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int org=num;
		while(num>0)
		{
			int last=num%10;
			rev=rev*10+last;
			num=num/10;
			
		}
		if(org==rev)
			System.out.println(org+" is palindrome");
		else
			System.out.println(org+" is not a palindrome");
		
		sc.close();
	}

}
