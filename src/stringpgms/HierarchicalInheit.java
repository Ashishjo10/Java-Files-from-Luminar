package stringpgms;

class volkswagen
{
	public void display()
	{
		System.out.println("List of brands");
	}
}

class Audi extends volkswagen
{
	public void Audisales()
	{
		System.out.println("Audi sales report");
	}
}

class Skoda extends volkswagen
{
	public void Skodasales()
	{
		System.out.println("Skoda sales report");
	}
}




public class HierarchicalInheit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Skoda ss=new Skoda();
		Audi aa=new Audi();
		ss.display();
		ss.Skodasales();
		aa.Audisales();
	}

}
