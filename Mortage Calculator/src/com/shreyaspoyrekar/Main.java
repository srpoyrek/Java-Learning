/*
File: Main.Java
Project: Mortgage Calculator
Date: 7/9/2020
Description: A simple mortgage monthly payment calculator in dollars.
reference: https://www.wikihow.com/Calculate-Mortgage-Payments
 */
package com.shreyaspoyrekar;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // months and percent constants
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        //define variables
        int principal;
        float annualInterestRate;
        float monthlyInterestRate;
        byte years;
        int numberOfPayments;


        // initialize a scanner object
        Scanner scanner = new Scanner(System.in);

        //get the principal amount
        while(true) {
            System.out.print("Principal ($1K - $1M): ");
            principal = scanner.nextInt();
            if ((principal <= 1000_000) && (1000 <= principal))
                break;
            System.out.println("Enter a number between 1,000 and 1,000,000.");
        }

        // get the annual interest rate and calculate the monthly interest rate
        while(true){
            System.out.print("Annual Interest Rate: ");
            annualInterestRate = scanner.nextFloat();
            if ((annualInterestRate < 30) && (0 < annualInterestRate))
                break;
            System.out.println("Enter a value greater than 0 and less than 30.");
        }
        monthlyInterestRate = annualInterestRate / PERCENT / MONTHS_IN_YEAR ;

        // get the period in years and calculate the number of payments
        while (true) {
            System.out.print("Period (Years): ");
            years = scanner.nextByte();
            if ((years <= 30) && (1 <= years))
                break;
            System.out.println("Enter a value between 1 and 30.");
        }
        numberOfPayments = years * MONTHS_IN_YEAR;

        // calculate the mortgage
        double mortgage = principal
                * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfPayments))
                / (Math.pow(1 + monthlyInterestRate, numberOfPayments) - 1) ;
        // convert the mortgage in currency
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        // output
        System.out.println("Mortgage: " + currency.format(mortgage));

    }
}
