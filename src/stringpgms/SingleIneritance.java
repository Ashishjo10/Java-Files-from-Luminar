package stringpgms;

class car
{
	public void display() 
	{
		System.out.println("Car Details");
	}
}

class Bmw extends car
{
	public void Bmwdetails()
	{
		System.out.println("BMW Details");
	}
}



public class SingleIneritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bmw dd=new Bmw();
		dd.display();
		dd.Bmwdetails();
		
		

	}

}
