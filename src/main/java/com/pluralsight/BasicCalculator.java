package com.pluralsight;
import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {

        //Step #1
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Enter the first number: ");

        int firstNumber = myScanner.nextInt();

        System.out.println("Enter the second number: ");

        int secondNumber = myScanner.nextInt();

        System.out.println("Possible calculations: ");
        System.out.println("    (A)Add");
        System.out.println("    (S)Subtract");
        System.out.println("    (M)Multiply");
        System.out.println("    (D)Divide");
        System.out.println("Please select an option: ");
        myScanner.nextLine();

        String letterOption = myScanner.nextLine();

        System.out.println(firstNumber + " * " + secondNumber + " = " + firstNumber * secondNumber);






    }
}
