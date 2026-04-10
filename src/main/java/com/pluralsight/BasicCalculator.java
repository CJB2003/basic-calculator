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

        String letterOption = myScanner.nextLine();
        //Created functioning calculator with if statements with .equals
        //Multiple calculating options including A for addition, S for subtraction, M for multiplication, D for division
        //Based on user input
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

        //testing another ways to work about my calculator
        /*
        if (Objects.equals(letterOption, "A")) {
            double calcSum = firstNumber + secondNumber;
            System.out.println(firstNumber + " + " + secondNumber + " = " + calcSum);
        }
        else if (Objects.equals(letterOption, "S")) {
            double calcDifference = firstNumber - secondNumber;
            System.out.println(firstNumber + " - " + secondNumber + " = " + calcDifference);
        }
        else if (Objects.equals(letterOption, "M")) {
            double calcProduct = firstNumber * secondNumber;
            System.out.println(firstNumber + " * " + secondNumber + " = " + calcProduct);
        }
        else if (Objects.equals(letterOption, "D")) {
            double calcQuotient = firstNumber / secondNumber;
            System.out.println(firstNumber + " / " + secondNumber + " = " + calcQuotient);
        }
        */
    }
}
