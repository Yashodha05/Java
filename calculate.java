package Week3;

import java.util.Scanner;
public class calculate {
  public static void main(String[] args) {
    float sum =0.0f;
    Scanner sc = new Scanner (System.in);
    /*This line declares array Integer Wrapper Object */ 
    Integer cie[] = new Integer [3];
    
    for (int i=0; i< 3; i++) {
      System.out.println("Enter the score of Internal : "+(i+1));
      /* - Autobox
      * The parsed value of integer constant is converted wrapper Object */ 
      cie[i] = Integer.parseInt(sc.next());
      /* Unbox
      * The wrapper Object value is converted into Primitive Data Type */ 
      sum=sum + cie[i];
    }
      System.out.println("The average Internal Score is "+(sum/3));
      sc.close();
    
  }
}