package stringpgms;

public class Methodpgnm {

	public static void main(String[] args) {
		
		
		Methodpgnm md=new Methodpgnm();
		md.add();
		md.sub();
		md.mul(5, 3);
		md.div(10, 5);

	}

	public void add()          // without returntype and without parameter
	{
		int a=10,b=20,c;
		c=a+b;
		System.out.println(c);
	}
	
	
	
	public int sub()            // with returntype and without parameter
	{
		int a=10,b=5,c;
		c=a-b;
		System.out.println(c);
		return c;
	}
	
	public void mul(int a,int b)  //without returntype and with parameter
	{
		int c;
		c=a*b;
		System.out.println(c);
	}
	
	
	public int div(int a,int b)                   //with returntype and with parameter
	{
		int c;
		c=a/b;
		System.out.println(c);	
		return c;
	}
	
	
	
	
}
