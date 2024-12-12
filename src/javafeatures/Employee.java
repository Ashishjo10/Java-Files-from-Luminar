package javafeatures;

public class Employee {
	
	int empid;
	String empname;
	String empdesgn;

	public static void main(String[] args) {
		
		Employee emp1=new Employee();
		System.out.println(emp1.empid=101);
		System.out.println(emp1.empname="AJIO");
		System.out.println(emp1.empdesgn="Analyst");
		
		Employee emp2=new Employee();
		System.out.println(emp2.empid=102);
		System.out.println(emp2.empname="Jio");
		System.out.println(emp2.empdesgn="Architect");
		
		Employee emp3=new Employee();
		System.out.println(emp3.empid=103);
		System.out.println(emp3.empname="Reebok");
		System.out.println(emp3.empdesgn="Tester");

	}

}
