package javafeatures;

import java.util.Scanner;

public class Seriesprint {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the no. of Queries:");
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            
            int sum = a;
            System.out.println("The series of no.:");
            // Loop to generate the series of 'n' terms
            for (int j = 0; j < n; j++) {
                // Calculate the next term in the series
                sum += (b * Math.pow(2, j));
                
                // Print the term, followed by a space (without newline)
                System.out.print(sum + " ");
            }
            
            // Move to the next line after printing the series for this query
            System.out.println();
        }
        in.close();
	}

}
