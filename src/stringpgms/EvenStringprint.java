package stringpgms;

import java.util.Scanner;

public class EvenStringprint {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();

		String[] s1=s.split(" ");
		
		for(int i=0;i<s1.length;i++)
		{
			if(i%2==0)
			{
				System.out.print(s1[i]+" ");
			}
		}
sc.close();
	}

}
