package stjuly;

public class Operators {

	public static void main(String[] args) {
		int a=10,b=5;
		System.out.println("Sum="+(a+b));
		System.out.println("Sub="+(a-b));
		System.out.println("Mul="+(a*b));
		System.out.println("Div="+(a/b));
		System.out.println("Mod="+(a%b));
		System.out.println("Greater="+(a>b));
		System.out.println("Lesser="+(a<b));
		System.out.println("Equals="+(a==b));
		int c=a;
		System.out.println("Value of c="+c);
		System.out.println("Value of c+a="+(c+=a));
		System.out.println("Value of c-b="+(c-=b));
		System.out.println("Not Equal="+(a!=b));
		System.out.println("Greater than equal="+(a>=b));
		System.out.println("Lesser than equal="+(a<=b));
		
		String first="Ashish";
		String last ="Ashish Joseph";
		System.out.println((first=="Ashish")&&(last=="Ashish Joseph"));
		System.out.println((first=="Ashishjo")&&(last=="Ashish Joseph"));
		System.out.println((first=="Ashish")||(last=="Joseph Elias"));
		System.out.println((first=="Ashishjo")||(last=="Joseph Elias"));
		System.out.println(!(first=="Ashish"));
		System.out.println(!(first=="Ashishjo"));
		
		System.out.println(a++);
		System.out.println(a);
		System.out.println(a--);
		System.out.println(a);
		System.out.println(b--);
		System.out.println(b);
		System.out.println(--b);
		System.out.println(b);
		
		
		String d=a<b?"a is smaller":"b is smaller";
		System.out.println(d);
		
		

	}

}
