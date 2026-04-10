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
            double calcSum = firstNumber + secondNumber;
            System.out.println(firstNumber + " + " + secondNumber + " = " + calcSum);
        }
        else if (letterOption.equals("S")) {
            double calcDifference = firstNumber - secondNumber;
            System.out.println(firstNumber + " - " + secondNumber + " = " + calcDifference);
        }
        else if (letterOption.equals("M")) {
            double calcProduct = firstNumber * secondNumber;
            System.out.println(firstNumber + " * " + secondNumber + " = " + calcProduct);
        }
        else if (letterOption.equals("D")) {
            double calcQuotient = firstNumber / secondNumber;
            System.out.println(firstNumber + " / " + secondNumber + " = " + calcQuotient);
        }
        /*
        if (Objects.equals(letterOption, "A")) {
            double calcAddition = firstNumber + secondNumber;
            System.out.println(firstNumber + " + " + secondNumber + " = " + calcAddition);
        }
        else if (Objects.equals(letterOption, "S")) {
            double calcDifference = firstNumber - secondNumber;
            System.out.println(firstNumber + " - " + secondNumber + " = " + calcDifference);
        }
        else if (Objects.equals(letterOption, "M")) {
            double calcMultiply = firstNumber * secondNumber;
            System.out.println(firstNumber + " * " + secondNumber + " = " + calcMultiply);
        }
        else if (Objects.equals(letterOption, "D")) {
            double calcDivide = firstNumber / secondNumber;
            System.out.println(firstNumber + " / " + secondNumber + " = " + calcDivide);
        }
        */
    }
}
