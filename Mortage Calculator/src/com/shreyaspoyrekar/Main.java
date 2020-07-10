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

        // initialize a scanner object
        Scanner scanner = new Scanner(System.in);

        //get the principal amount
        System.out.print("Principal: ");
        int principal = scanner.nextInt();

        // get the annual interest rate and calculate the monthly interest rate
        System.out.print("Annual Interest Rate: ");
        float annualInterestRate = scanner.nextFloat();
        float monthlyInterestRate = annualInterestRate / PERCENT / MONTHS_IN_YEAR ;

        // get the period in years and calculate the number of payments
        System.out.print("Period (Years): ");
        byte years = scanner.nextByte();
        int numberOfPayments = years * MONTHS_IN_YEAR;

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
