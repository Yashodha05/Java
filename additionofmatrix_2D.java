package Week7;

import java.util.Scanner;
public class additionofmatrix_2D {
        public static void main(String args[]) {
                int matrix1[][]=new int[3][3];
                int matrix2[][]=new int[3][3];
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter matrix size: ");
                int rows=sc.nextInt();
                int cols= sc.nextInt();
                System.out.println("Enter matrix1 elements one by one: ");
                for (int i=0; i<rows; i++) {
                        for (int j=0; j<cols; j++) {
                                matrix1[i][j] = sc.nextInt();
                        }
                }

        System.out.println("Enter matrix2 elements one by one: ");
        for (int i=0; i<rows; i++) {
                for (int j=0; j<cols; j++) {
                        matrix2[i][j] = sc.nextInt();
                }
        }
        int result[][] = new int [3][3];
        for (int i=0; i<rows; i++) {
                for (int j=0; j<cols; j++) {
                        result[i][j] = matrix1[i][j] + matrix2[i][j];
                }
        }
        System.out.println("Result Matrix: ");
        for (int i=0; i<rows; i++) {
                for (int j=0; j<cols; j++) {
                        System.out.print(result[i][j] + "\t");

                }
                System.out.println("");
        }
        }
} 
