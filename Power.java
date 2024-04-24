package W5;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         System.out.print("Enter the base (X): ");
        int base = scanner.nextInt();
        System.out.print("Enter the exponent (n): ");
        int exponent = scanner.nextInt();
        int result = 1;
               for (int i = 0; i < exponent; i++) {
            result *= base; 
        }

        System.out.println("Result: " + result);

        scanner.close();
    }
}