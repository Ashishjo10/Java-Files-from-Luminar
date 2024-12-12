
public class ExcepPgmnew {

	public static void main(String[] args) {
		try
		{
			int c=5/0;
			System.out.println(c);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		System.out.println("Hello Sir");
		
		
		try
		{
			String s=null;
			System.out.println(s.length());
		}
		catch(NullPointerException e)
		{
			System.out.println(e.getMessage());
		}
		
	
		try
		{
		int arr[]= {1,2,3,4,5};
		for(int i=0;i<=5;i++)
		{
			System.out.println(arr[i]);
		}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}

		
	}

}
