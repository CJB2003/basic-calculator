package com.pluralsight;

import java.util.Scanner;
import java.util.Objects;

public class BasicCalculator {
    public static void main(String[] args) {

        //Step #1
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Enter the first number: ");

        double firstNumber = myScanner.nextDouble();

        System.out.println("Enter the second number: ");

        double secondNumber = myScanner.nextDouble();

        System.out.println("Possible calculations: ");
        System.out.println("    (A)Add");
        System.out.println("    (S)Subtract");
        System.out.println("    (M)Multiply");
        System.out.println("    (D)Divide");
        System.out.println("Please select an option: ");
        myScanner.nextLine();

        //Made functioning calculator with if statements with .equals
        String letterOption = myScanner.nextLine();
        if (letterOption.equals("A")) {
            double sumAddition = firstNumber + secondNumber;
            System.out.println(firstNumber + " + " + secondNumber + " = " + sumAddition);
        }
        else if (letterOption.equals("S")) {
            double sumDifference = firstNumber - secondNumber;
            System.out.println(firstNumber + " - " + secondNumber + " = " + sumDifference);
        }
        else if (letterOption.equals("M")) {
            double sumProduct = firstNumber * secondNumber;
            System.out.println(firstNumber + " * " + secondNumber + " = " + sumProduct);
        }
        else if (letterOption.equals("D")) {
            double sumQuotient = firstNumber / secondNumber;
            System.out.println(firstNumber + " / " + secondNumber + " = " + sumQuotient);
        }
        /*
        if (Objects.equals(letterOption, "A")) {
            double sumAddition = firstNumber + secondNumber;
            System.out.println(firstNumber + " + " + secondNumber + " = " + sumAddition);
        }
        else if (Objects.equals(letterOption, "S")) {
            double sumDifference = firstNumber - secondNumber;
            System.out.println(firstNumber + " - " + secondNumber + " = " + sumDifference);
        }
        else if (Objects.equals(letterOption, "M")) {
            double sumMultiply = firstNumber * secondNumber;
            System.out.println(firstNumber + " * " + secondNumber + " = " + sumMultiply);
        }
        else if (Objects.equals(letterOption, "D")) {
            double sumDivide = firstNumber / secondNumber;
            System.out.println(firstNumber + " / " + secondNumber + " = " + sumDivide);
        }
        */
    }
}
