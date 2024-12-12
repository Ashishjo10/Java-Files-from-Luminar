package stringpgms;

class Employees
{
	private String emplyename;
	private String empdesig;
	private int emppid;
	public String getEmplyename() {
		return emplyename;
	}
	public void setEmplyename(String emplyename) {
		this.emplyename = emplyename;
	}
	public String getEmpdesig() {
		return empdesig;
	}
	public void setEmpdesig(String empdesig) {
		this.empdesig = empdesig;
	}
	public int getEmppid() {
		return emppid;
	}
	public void setEmppid(int emppid) {
		this.emppid = emppid;
	}
	
}

public class EncapsulationPgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employees ee=new Employees();
		ee.setEmplyename("ABC");
		ee.setEmpdesig("Manager");
		ee.setEmppid(123);
		System.out.println(ee.getEmplyename());
		System.out.println(ee.getEmpdesig());
		System.out.println(ee.getEmppid());
		

	}

}
