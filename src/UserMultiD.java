import java.util.Scanner;

public class UserMultiD {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Usename Array");
		 System.out.println("Enter the row size:");
		 int row=sc.nextInt();
		 System.out.println("Enter the column size:");
		 int col=sc.nextInt();
		 String[][] arr=new String[row][col];
		 sc.nextLine();
		 System.out.println("Username");
		 for(int k=0;k<row;k++)
		 {
			 for(int j=0;j<col;j++)
			 {
				 arr[k][j]=sc.nextLine();
			 }
		 }
		 
		 System.out.println("Password Array");
		 System.out.println("Enter the row size:");
		 int row1=sc.nextInt();
		 System.out.println("Enter the column size:");
		 int col1=sc.nextInt();
		 String[][] arrk=new String[row1][col1];
		 sc.nextLine();
		 System.out.println("Password");
		 for(int m=0;m<row1;m++)
		 {
			 for(int n=0;n<col1;n++)
			 {
				 arrk[m][n]=sc.nextLine();
			 }
		 }
		 
		 
		 
		 
		 System.out.println("Usernames are");
		 for(int i=0;i<row;i++)
		 {
			 for(int j=0;j<col;j++)
			 {
				 System.out.println(arr[i][j]+" ");
			 }
			 System.out.println();
		 }
		 
		 System.out.println("Passwords are");
		 for(int p=0;p<row1;p++)
		 {
			 for(int l=0;l<col1;l++)
			 {
				 System.out.println(arrk[p][l]+" ");
			 }
			 System.out.println();
		 }
		 
		 sc.close();

	}

}
