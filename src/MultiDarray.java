import java.util.Scanner;

public class MultiDarray {

	public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the row size:");
	 int row=sc.nextInt();
	 System.out.println("Enter the column size:");
	 int col=sc.nextInt();
	 int[][] arr=new int[row][col];
	 System.out.println("Elements");
	 for(int k=0;k<row;k++)
	 {
		 for(int j=0;j<col;j++)
		 {
			 arr[k][j]=sc.nextInt();
		 }
	 }
	// arr[0][0]=1;
	 //arr[0][1]=2;
	// arr[1][0]=3;
	// arr[1][1]=4;
	 System.out.println("Elements are:");
	 for(int i=0;i<row;i++)
	 {
		 for(int j=0;j<col;j++)
		 {
			 System.out.println(arr[i][j]+" ");
		 }
		 System.out.println();
	 }
	 
	 sc.close();
	 
	}
}
	 