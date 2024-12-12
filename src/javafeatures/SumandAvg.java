package javafeatures;

import java.util.Scanner;

public class SumandAvg {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int sum=0,avg;
		int[] arr=new int[2];
		System.out.println("Enter the numbers:");
		arr[0]=sc.nextInt();
		arr[1]=sc.nextInt();
		for(int i=0;i<2;i++)
		{
			 sum=sum+arr[i];
		}
		avg=sum/2;
		System.out.println("Sum="+sum);
		System.out.println("Avg="+avg);
sc.close();
	}

}
