package W5;

import java.util.Scanner;

public class SalaryCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of employees: ");
        int numEmployees = scanner.nextInt();

        while (numEmployees <= 0) {
            System.out.println("Number of employees must be positive. Please enter again.");
            numEmployees = scanner.nextInt();
        }

        double totalSalary = 0;

        for (int i = 1; i <= numEmployees; i++) {
            System.out.println("\nEmployee " + i + ":");
            System.out.print("Enter hourly wage for employee " + i + ": ");
            double hourlyWage = scanner.nextDouble();

            while (hourlyWage < 0) {
                System.out.println("Hourly wage cannot be negative. Please enter again.");
                hourlyWage = scanner.nextDouble();
            }

            System.out.print("Enter hours worked for employee " + i + ": ");
            double hoursWorked = scanner.nextDouble();

          
            while (hoursWorked < 0) {
                System.out.println("Hours worked cannot be negative. Please enter again.");
                hoursWorked = scanner.nextDouble();
            }
                           
            double salary = hourlyWage * hoursWorked;
            
            System.out.println("Salary for employee " + i + ": $" + salary);
           
            totalSalary += salary;
        }
   
        System.out.println("\nTotal salary for all employees: $" + totalSalary);

        scanner.close();
    }
}