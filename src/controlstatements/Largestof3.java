package controlstatements;

public class Largestof3 {

	public static void main(String[] args) {
		int a=5,b=9,c=15;
		if(a>b&&a>c)
			System.out.println(a+" is largest");
		else if(b>a&&b>c)
			System.out.println(b+" is largest");
		else
			System.out.println(c+" is largest");
		
	}

}
