package com.pluralsight;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter the Name of the Worker : ");
        String name = scanner.next();
        System.out.println("Please Enter the hours worked " );
        float hours = scanner.nextFloat();
        System.out.println("Please Enter the payrate ");
        float rate = scanner.nextFloat()*hours;

        System.out.println(name+"'s gross pay rate is $" +rate);
        
        }
    }
