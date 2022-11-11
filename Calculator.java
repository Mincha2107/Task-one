/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package calculator.calculator;

/**
 *
 * @author MINCHA
 */
import java.util.Scanner;
public class Calculator {

    public static void main(String[] args) {
        char operator;
    Double number1, number2, result;

    // create an object of Scanner class
    Scanner input = new Scanner(System.in);

    // ask users to enter operator
    System.out.println("Choose an operator: +, -, *, or /");
    operator = input.next().charAt(0);

    // ask users to enter numbers
    System.out.println("Enter first number");
    number1 = input.nextDouble();

    System.out.println("Enter second number");
    number2 = input.nextDouble();

    switch (operator) {
         // performs addition between numbers
      case '+' -> {
          result = number1 + number2;
          System.out.println(number1 + " + " + number2 + " = " + result);
            }
       // performs subtraction between numbers
      case '-' -> {
          result = number1 - number2;
          System.out.println(number1 + " - " + number2 + " = " + result);
            }
      // performs multiplication between numbers
      case '*' -> {
          result = number1 * number2;
          System.out.println(number1 + " * " + number2 + " = " + result);
            }
       // performs division between numbers
      case '/' -> {
          result = number1 / number2;
          System.out.println(number1 + " / " + number2 + " = " + result);
            }

      default -> System.out.println("Invalid operator!");
    }
       
    input.close();
  }
}