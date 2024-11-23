package com.pluralsight;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to the Sandwich Shop ");
        Scanner scanner = new Scanner(System.in);
        final double largePrice = 8.95;
        final double mediumPrice = 5.95;
        double choice = 0;
        System.out.println("Please select the size of your Sandwich : (L)arge = 8.95, (M)edium = 5.95, (S)mall = 4.95 ");
        String size = scanner.next();
        if ((size.equals("l")) || (size.equals("L"))) {
            choice = largePrice;
        } else if ((size.equals("m")) || (size.equals("M"))) {
            choice = mediumPrice;
        }
        System.out.println("Please Enter your age : ");
        int age = scanner.nextInt();
        double cost = ageDiscount(age, choice);

        System.out.println("The cost of the sandwich is $" + cost);


    }

    public static double ageDiscount(int age, double choice) {
        double discountedprice = 0.0;
        if (age<=17){
            discountedprice = choice*.90;
        } else if (age>=65) {
            discountedprice = choice*.80;
        }
        return discountedprice;
    }
}