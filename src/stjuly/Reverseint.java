package stjuly;

public class Reverseint {

	public static void main(String[] args) {
		int num=12345,digit,rev=0;
		while(num!=0)
		{
			digit=num%10;
			rev=rev*10+digit;
			num/=10;
		}
		System.out.println("Reverse int="+rev);

	}

}
