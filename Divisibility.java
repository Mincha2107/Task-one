/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
//Task one for question 3
package divisibility.divisibility;

/**
 *
 * @author MINCHA
 */
import java.util.Scanner;
public class Divisibility {
 //Function for divisibility by 5
    static boolean isDivisibleBy5(String num)
    {
        // Number of Digits
        int sz = num.length();
 
        // Checking if last digit is 5
        // Checking if last digit is 0
        return (
            (Integer.parseInt(num.substring(sz - 1)) == 5)
            || (Integer.parseInt(num.substring(sz - 1))
                == 0));
    }
    public static void main(String[] args) {

        int num;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter any number:");
        num = s.nextInt();
        // Checking if remainder is 0 or not when divided by 5
        if(num % 5 == 0)
        {
            // Print if number is divisible by 5
            System.out.println(num+" is divisible by 5");
        }
        else
        {
            // Print if number is not divisible by 5
            System.out.println(num+" is not divisible by 5");
        }
    }
}
    

