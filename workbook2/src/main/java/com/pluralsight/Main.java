package com.pluralsight;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter your name : ");
        String name = scanner.nextLine();
        System.out.println("What date will you be coming? MM/dd/YYYY");
        String date = scanner.nextLine();
        System.out.println("How many tickets would you like? ");
        int tickets = scanner.nextInt();

        DateTimeFormatter formatter;
        formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate bday = LocalDate.parse(date, formatter);

        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String formatteddate = bday.format(formatter1);

        System.out.println(tickets+" ticket(s) reserved for "+ formatteddate+ " for "+name);





    }
}