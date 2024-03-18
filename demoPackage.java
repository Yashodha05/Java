package Week6;
import emp.Employee;
import bonus.issuebonus;
public class demoPackage {

	public static void main(String[] args) {
		System.out.println("this program illustrates use of packages...");
		Employee list[]= new Employee[3];
		/* initialize array of objects individually*/
		for(byte i=0; i<list.length; i++)
			list[i]=new Employee();
		System.out.println("\n**************************************************");
		System.out.println("empId empName expYear salary");
		System.out.println("****************************************************");
		for (byte i=0; i<list.length; i++) {
			issuebonus.issueEmployeeBonus(list[i]);
			list[i].getEmployee();
		}
		System.out.println("*****************************************************");	
		
		

	}

}
