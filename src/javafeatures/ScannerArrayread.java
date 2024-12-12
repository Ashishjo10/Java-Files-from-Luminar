package javafeatures;

import java.util.Scanner;

public class ScannerArrayread {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[5];
		System.out.println("Enter the elements:");
		for(int i=0;i<5;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int j=0;j<5;j++)
		{
			System.out.println("Array Elements:"+arr[j]);
		}
sc.close();
	}

}
