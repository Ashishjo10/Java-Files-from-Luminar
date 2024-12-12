package stringpgms;

interface Carinfo
{
	public void acceleration();
	public void engineno();
	public void chasisno();
}

class Tesla implements Carinfo
{

	@Override
	public void acceleration() {
		System.out.println("speed=6.1/sec");
		
	}

	@Override
	public void engineno() {
		System.out.println("Engineno=23153");
		
	}

	@Override
	public void chasisno() {
		System.out.println("chasisno=45355");
		
	}
	
}

public class InterfacePgm {

	public static void main(String[] args) {
		
		Tesla ts=new Tesla();
		ts.acceleration();
		ts.chasisno();
		ts.engineno();

	}

}
