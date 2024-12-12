package stjuly;

public class Sumdigits {

	public static void main(String[] args) {
		int num=153,sum=0;
		while(num!=0)
		{
			int digit=num%10;
			sum=sum+digit;
			num/=10;
		}
        System.out.println("Sum of digits=" +sum);
	}

}
