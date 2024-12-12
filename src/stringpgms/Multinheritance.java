package stringpgms;


class birds
{
	public void display()
	{
		System.out.println("Birds");
	}
}

class hen extends birds
{
	public void henfarm()
	{
		System.out.println("Hen details");
	}
}

class chicken extends hen
{
	public void chickenrate()
	{
		System.out.println("Chicken details");
	}
}


public class Multinheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		chicken cc=new chicken();
		cc.display();
		cc.henfarm();
		cc.chickenrate();
		
	}

}
