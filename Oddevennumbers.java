/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package get.oddevennumbers;

/**
 *
 * @author MINCHA
 */
import java.util.Scanner;
public class Oddevennumbers {
//declaring variables
    String name;
    int age;
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Enter your sir name ");
        int name = reader.nextInt();
         System.out.print("Enter your age ");
        int age = reader.nextInt();
         String EvenOdd;
           if(age % 2 == 0)
           EvenOdd = "Even";
         else{
             EvenOdd = "Odd"; 
         } 
// The output
         System.out.print("The number of letters in your sir name is:" +name);
          System.out.print("Your current age is an:" +age);
         
        
    }
}
