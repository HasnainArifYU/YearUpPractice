package com.pluralsight;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter your FUll name : ");
        String fullName = scanner.nextLine();
        String[] names = fullName.split(" ");
        String firstName = null;
        String lastName = null;
        String MiddleName = null;
        String Suffix = null;

        if (names.length == 2) {
            firstName = names[0];
            lastName=names[1];
        } else if (names.length == 3) {
            firstName = names[0];
            MiddleName = names[1];
            lastName = names[2];
        } else if (names.length==4) {
            firstName = names[0];
            MiddleName = names[1];
            lastName = names[2];
            Suffix = names[3];
        }

        System.out.println("First name: "+firstName);
        System.out.println("Middle name: "+MiddleName);
        System.out.println("Last name: "+lastName);
        System.out.println("Suffix: "+Suffix);
    }
}