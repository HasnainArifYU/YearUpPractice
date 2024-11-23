package com.pluralsight;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter the first number ");
        int num1 = scanner.nextInt();
        System.out.println("Please Enter the last number ");
        int num2 = scanner.nextInt();
        double num3 = 0.0;
        System.out.println("Possible calculations:\n" +
                "(A)dd\n" +
                "(S)ubtract\n" +
                "(M)ultiply\n" +
                "(D)ivide\n" +
                "Please select an option: ");

        String operator = scanner.next();
        if (operator.equals("M")  || operator.equals("m")) {
            num3 = num1*num2;
            System.out.println("The result is " + num3);
        } else if (operator.equals("S") || operator.equals("s")) {
            num3 = num1-num2;
            System.out.println("The result is " + num3);
        } else if (operator.equals("A") || operator.equals("a")) {
            num3 = num1+num2;
            System.out.println("The result is " + num3);
        } else if (operator.equals("D") || operator.equals("d")) {
            num3 = (double) num1 /num2;
            System.out.println("The result is " + num3);
        } else {
            System.out.println("You did not choose the right option.");
        }

    }
}