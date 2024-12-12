package javafeatures;

import java.util.Scanner;

public class InsideSc {

	public static void main(String[] args) {
		
		System.out.println("Enter a Number:");
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		
		System.out.println("Enter the Name:");
		String name=sc.next();
		
		System.out.println("Enter Full Name:");
		String fullname=sc.nextLine();
		
		System.out.println("Age:"+age);
		System.out.println("Name:"+name);
		System.out.println("Fullname:"+fullname);
		
sc.close();
	}

}
