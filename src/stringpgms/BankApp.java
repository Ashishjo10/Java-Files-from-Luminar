package stringpgms;

import java.util.Scanner;

interface bankdetails
{
	public void accountdetails();
	public void balance();
	public void withdrawal();
	public void deposit();
}


class Sbi implements bankdetails
{
	int b=45000,c,d,e;
	String s;
	Scanner sc=new Scanner(System.in);
    
	@Override
	public void accountdetails()
	{
		System.out.println("Enter your Account details:");
		System.out.println("Account No:");
		int ac=sc.nextInt();
		sc.nextLine();
		System.out.println("Branch:");
		s=sc.nextLine();
		System.out.println("Phone no:");
		e=sc.nextInt();
		System.out.println("Your Account details:");
		System.out.println("Account No:"+ac);
		System.out.println("Branch:"+s);
		System.out.println("Phone no:"+e);
		
	}

	@Override
	public void balance()
	{
		System.out.println("Your account balance is:"+b);
		
	}

	@Override
	public void withdrawal()
	{
		System.out.println("Enter the amount to withdraw");
		c=sc.nextInt();
		if(c<b)
		{
			b=b-c;
			System.out.println("Your balance after withdrawal:"+b);
		}
		else
		{
			System.out.println("insufficient");
		}
	}

	@Override
	public void deposit()
	{
		System.out.println("Enter the amount to deposit:");
		d=sc.nextInt();
		System.out.println("Total balance:"+(b+d));
		
	}
	
}

public class BankApp {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Sbi ss=new Sbi();
		ss.accountdetails();
		ss.balance();
		ss.withdrawal();
		ss.deposit();

	}

}
