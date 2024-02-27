class Employee
{
	String name;
	String gender;
	double salary;
	
	void Employee(String n, String g, double s)
	{
		name=n;
		gender=g;
		salary=s;
	}
	public void issuebonus()
	{
		if ("femle".equalsignoreCase(gender))
		{
		double bonus=salary*0.10;
		salary+=bonus;
		System.out.println("Bonus issued to"+ name+"Rs."+ bonus);
		}
	}
}
class BonusProcessor
{
	public static void main(String args[])
	{
		Employee employee1= new Employee("ritha", "female", 50000);
		Employee employee2= new Employee("pranav", "male", 10000);
		Employee employee3= new Employee("sahana", "female", 20000);
		employee1.issuebonus();
		employee2.issuebonus();
		employee3.issuebonus();
	}
}