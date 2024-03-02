package Week5;

import java.util.Scanner;
public class Classticket {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		System.out.println("enter the age of traveller:");
		int traveller_age= sc.nextInt();
		System.out.println("enter gender;\n f for women and m for male");
		char gender=sc.next().charAt(0);
		double ticket_base_price=1500;
		double ticket_price =1500;
		if (traveller_age>=60)
		{
			if (gender== 'f') {
				ticket_price=ticket_base_price*0.15;
				
			}
			else {
				ticket_price=ticket_base_price;
			}
			System.out.println("the price of the ticket"+ ticket_price);
			
		}
        
	}

}
