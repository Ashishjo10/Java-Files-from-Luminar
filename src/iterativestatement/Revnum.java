package iterativestatement;

public class Revnum {

	public static void main(String[] args) {
		int n=256,rev=0,last;
		while(n!=0)
		{
			last=n%10;
			rev=rev*10+last;
			n/=10;
		}
		System.out.println("Output="+rev);

	}

}
