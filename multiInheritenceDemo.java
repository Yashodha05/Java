package Week8;
interface allowance
{
	final double dearnessallow=0.45;
	final double houseRentAllow=0.30;
	final double cityAllow=400.00;
	void calculateGross();
}
class Employee
{
	double basicsalary;
	double grosssalary;
	String empName;
	long empNumber;
	Employee(String name, long no, double sal)
	{
		empName=name;
		empNumber=no;
		basicsalary=sal;
	
	}
	void displayEmployeeDetails() {
		System.out.println("**************************************************************");
		System.out.println("Employee name\t:\t"+ empName);
		System.out.println("his employee number\t:\t"+empNumber);
		System.out.println("his basic salary\t:\t"+basicsalary);
		System.out.println("his gross salary is \t:\t"+grosssalary);
	}
}
class payRoll extends Employee implements allowance {
	payRoll(String name, long no, double sal)
	{
		super (name, no, sal);
		calculateGross();
	}
	public void calculateGross()
	{
		grosssalary=basicsalary+(basicsalary*dearnessallow)+(basicsalary+houseRentAllow)+(cityAllow);
	}
}
public class multiInheritenceDemo {

	public static void main(String[] args) {
		payRoll virat= new payRoll("virat sharma", 128966, 45678.0d);
		virat.displayEmployeeDetails();
		payRoll suresh= new payRoll("suresh singh", 129966, 25378.0d);
		suresh.displayEmployeeDetails();
	}

}
