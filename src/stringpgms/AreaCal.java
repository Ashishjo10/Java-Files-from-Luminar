package stringpgms;

import java.util.Scanner;

public class AreaCal {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		AreaCal ar=new AreaCal();
		ar.square();
		ar.circle(5.2);
		ar.triangle(sc);
		ar.rectangle(sc);
	}

	public void square()
	{
		int a=5,c;
		c=a*a;
		System.out.println("Area of Square="+c);
	}
	
	
	public double circle(double r)
	{
		double a;
		a=3.14*r*r;
		System.out.println("Area of circle="+a);
		return a;	
	}
	
	public void triangle(Scanner sc)
	{
		//Scanner sc=new Scanner(System.in);
		double a;
		int b,h;
		System.out.println("Value of b");
		b=sc.nextInt();
		System.out.println("Value of h");
		h=sc.nextInt();
		a=0.5*(b*h);
		System.out.println("Area of Triangle="+a);
	}
	
	public int rectangle(Scanner sc)
	{
		int a;
		//Scanner sc=new Scanner(System.in);
		System.out.println("Value of l");
		int l=sc.nextInt();
		System.out.println("Value of b");
		int b=sc.nextInt();
		a=l*b;
		System.out.println("Area of rectangle="+a);
		return a;
	}
	
}
