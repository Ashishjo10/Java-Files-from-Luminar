package javafeatures;

public class Fibonacciseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int first=0,second=1;
          System.out.println("Fibonacci series:");
          for(int i=0;i<=10;i++)
          {
           System.out.print(first+" ");  
          int next=first+second;
          first=second;
          second=next;
         
          }
	}

}
