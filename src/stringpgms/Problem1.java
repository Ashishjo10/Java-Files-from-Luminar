package stringpgms;

class Member
{
	String name;
	int age;
	int phone;
	String address;
	int salary;
	
	public Member(String name, int age, int phone, String address, int salary) 
	{
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.address = address;
        this.salary = salary;
	}


	public void printdetails()
	{
		System.out.println(name);
		System.out.println(age);
		System.out.println(phone);
		System.out.println(address);
		System.out.println(salary);
	}
}

class Employee extends Member
{
	String specilization;
	String department;
	
	public Employee(String name, int age, int phone, String address, int salary, String specilization, String department) 
	{
		super(name, age, phone, address, salary);

		this.specilization=specilization;
		this.department=department;
	}
	
	public void printdetails()
	{
		super.printdetails();
		System.out.println("Specialization:"+specilization);
		System.out.println("Department:"+department);
	}
}
	

class Manager extends Member
{
	String specilization;
	String department;
	
	public Manager(String name, int age, int phone, String address, int salary, String specilization, String department) 
	{
		super(name, age, phone, address, salary);

		this.specilization=specilization;
		this.department=department;
	}
	
	public void printdetails()
	{
		super.printdetails();
		System.out.println("Specialization:"+specilization);
		System.out.println("Department:"+department);	
	}
}

public class Problem1 {

	public static void main(String[] args) {
		
		Employee ee=new Employee("AJ",22,12345,"KL",5000,"tester","IT");
		ee.printdetails();
		
		Manager mm=new Manager("NANA",25,67891,"AP",3000,"manger","HR");
		mm.printdetails();
	}

}
