package com.pluralsight;

import java.util.Scanner;

public class Stringbuilder {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        StringBuilder Stringb = new StringBuilder();
        System.out.println("Please provide the following infromation : ");
        System.out.println("Full Name : ");
        Stringb.append(scanner.nextLine());
        System.out.println("Address : ");
        Stringb.append("\n").append(scanner.nextLine());
        
    }
}
