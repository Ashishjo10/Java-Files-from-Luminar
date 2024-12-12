package datastructures;

public class Arrays {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
		for(int i=0;i<arr.length;i++)     //iteration of values
		{
			System.out.println(" Elment at index " + i +" = "+arr[i]);
		}
		arr[4]=10;
		System.out.println(" Element at index 4 = "+arr[4]);

	}

}
