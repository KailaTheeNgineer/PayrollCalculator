package com.pluralsight;
import java.util.*;
/* initialising user input */

public class PayrollCalculator {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
System.out.println("Welcome to Payroll Calculator");
System.out.print("To begin, please enter your Name: ");
       String name = myScanner.nextLine();

        System.out.print("Please enter how many hours you work: ");
        double hours = myScanner.nextDouble();

        System.out.print("Please enter your pay rate: ");
        double pay = myScanner.nextDouble();

        double salary = hours * pay;
        System.out.println("Thank you for using Payroll Calculator, " + name);
        System.out.println("Your gross pay is: " + salary);








    }
}
