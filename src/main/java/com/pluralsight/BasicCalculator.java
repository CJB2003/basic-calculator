package com.pluralsight;

import java.util.Scanner;
import java.util.Objects;

public class BasicCalculator {
    public static void main(String[] args) {

        //Step #1
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Enter the first number: ");

        double firstNumber = myScanner.nextInt();

        System.out.println("Enter the second number: ");

        double secondNumber = myScanner.nextInt();

        System.out.println("Possible calculations: ");
        System.out.println("    (A)Add");
        System.out.println("    (S)Subtract");
        System.out.println("    (M)Multiply");
        System.out.println("    (D)Divide");
        System.out.println("Please select an option: ");
        myScanner.nextLine();

        //Made functioning calculator with if statements and objects

        String letterOption = myScanner.nextLine();
        if (Objects.equals(letterOption, "A")) {
            double sumAddition = firstNumber + secondNumber;
            System.out.println(firstNumber + " + " + secondNumber + " = " + sumAddition);
        }
        else if (Objects.equals(letterOption, "S")) {
            double sumSubtraction = firstNumber - secondNumber;
            System.out.println(firstNumber + " - " + secondNumber + " = " + sumSubtraction);
        }
        else if (Objects.equals(letterOption, "M")) {
            double sumMultiply = firstNumber * secondNumber;
            System.out.println(firstNumber + " * " + secondNumber + " = " + sumMultiply);
        }
        else if (Objects.equals(letterOption, "D")) {
            double sumDivide = firstNumber / secondNumber;
            System.out.println(firstNumber + " / " + secondNumber + " = " + sumDivide);
        }

    }
}
