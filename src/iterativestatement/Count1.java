package iterativestatement;

public class Count1 {

	public static void main(String[] args) {
		int n=5876,count=0;
		while(n!=0)
		{
			int last=n%10;
			count++;
			n=n/10;
			
		}
       System.out.println(+count);
	}

}
