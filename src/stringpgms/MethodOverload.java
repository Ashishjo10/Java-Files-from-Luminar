package stringpgms;

public class MethodOverload {

	public static void main(String[] args) 
	{
		
	  MethodOverload ad=new MethodOverload();
	  ad.add();
	  ad.add(5, 4);
	  ad.add(25, 32);

	}
	
	
	public void add()
	{
		int a=10,b=15,c;
		c=a+b;
		System.out.println(c);
	}
	
	public void add(int a,int b)
	{
		int c=a+b;
		System.out.println(c);
	}
    public void add(double a,double b)
    {
    	double c=a+b;
    	System.out.println(c);
    }
}
