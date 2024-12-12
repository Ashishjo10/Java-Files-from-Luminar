package javafeatures;

import java.util.Scanner;

public class Primecheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		char op;
        do
        {
        	System.out.println("Enter a number:");
        	int a=sc.nextInt();
        	boolean isprime=true;
        	if(a<=1)
        	{
        		isprime=false;
        	}
        	else
        	{
        	 for(int i=2;i<=a/2;i++)
        	 {
        		if(a%i==0)
        		{
        			isprime=false;
        		    break;
        		}
        	 }
        	}
        	if(isprime)
        	{
        		System.out.println("Prime numnber");
        	}	
        	else
        	{
        		System.out.println("Not a Prime number");
        	}
        	System.out.println("Do you want to continue: Type y or n");
        	op=sc.next().charAt(0);
        }while(op=='y'||op=='y');
        sc.close();
	}

}
