/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package average.average;

/**
 *
 * @author MINCHA
 */
import java.util.Scanner;
public class Average {

    public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
   //Ask user to enter the first number
  System.out.print("Enter first unit: ");
  int num1 = input.nextInt();
   //Ask user to enter the second number
  System.out.print("Enter second unit: ");
  int num2 = input.nextInt();
   //Ask user to enter the third number
  System.out.print("Enter third unit: ");
  int num3 = input.nextInt();
   //Ask user to enter the fourth number
  System.out.print("Enter fourth unit: ");
  int num4 = input.nextInt();
  //Ask user to enter the fifth number
  System.out.print("Enter fifth unit: ");
  int num5 = input.nextInt();
  //getting average for the total marks
        System.out.println("Average of five units is: " + 
   (num1 + num2 + num3 + num4 + num5) / 5.00);
    }
}
