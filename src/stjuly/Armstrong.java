package stjuly;

public class Armstrong {

	public static void main(String[] args) {
		int num=153,original,remainder,result=0;
		original=num;
		while(original!=0)
		{
			remainder=original%10;
			result += remainder*remainder*remainder;
			original /=10;
		}
       if(result==num)
    	   System.out.println(num+ " is a Armstrong Number" );
       else
    	   System.out.println(num+ " is not a Armstrong Number" );
	}

}
