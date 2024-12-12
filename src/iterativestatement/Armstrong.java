package iterativestatement;

public class Armstrong {

	public static void main(String[] args) {
		int num=153,sum=0;
		while(num>0)
		{
			int last=num%10;
			 sum=last*last*last+sum;
			num=num/10;
			
		}
       System.out.println(+sum);
       
       }

}
