
package PRELIM;

import java.util.Scanner;

public class Activity1 {
    public static void main(String[] args){
    Scanner sc = new Scanner (System.in);
    
    System.out.print("Input the 1st number:  ");
    int num1 = sc.nextInt();
    System.out.print("Input the 2nd number:  ");
    int num2 = sc.nextInt();
    System.out.print("Input the 3rd number:  ");
    int num3 = sc.nextInt();
    
    int greatest = num1;
    if (num2 > greatest){
        greatest = num2;
    }
    if (num3 > greatest){
     greatest = num3;
     
     
            }
        System.out.println("The Greatest Number is: " + greatest);
        sc.close();
    }
    
}
