package Week1;
class Employee{
	String empname;
	int empno;
	float salary;
	String empdesig;
	byte expyears;
	void setEmployee(String n, int no, float s, String de, byte exp) {
		empname=n;
		empno=no;
		salary=s;
		empdesig=de;
		expyears=exp;
	}
	void getEmployee()
	{
		System.out.println(empname+"\t"+ empno+"\t"+salary+"\t"+empdesig+"\t"+expyears+"\n");
	}
}
public class demoEmployee {

	public static void main(String[] args) {
		Employee yashodha =new Employee();
		yashodha.setEmployee("pranav", 23, 100000, "PM", (byte)10);
		System.out.println("empname\tempno\t salary\tempdesig \t expyears\n");
		yashodha.getEmployee();
		Employee shruthi= new Employee();
		shruthi.empname="shruthi";
		shruthi.empno=12;
		shruthi.salary=300000;
		shruthi.empdesig="MD";
		shruthi.expyears=(byte)20;
		shruthi.getEmployee();
		

	}

}
