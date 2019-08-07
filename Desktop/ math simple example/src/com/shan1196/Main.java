package com.shan1196;


import java.text.NumberFormat;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        final byte MONTH_IN_YEAR = 12;
        final byte PERCENT = 100;
        Scanner scanner = new Scanner ( System.in );
        System.out.print ( "Principle : ");
        int principle = scanner.nextInt ();

        System.out.print ("Annual Interest Rate : ");
        float annualInterest = scanner.nextFloat ();
        float monthlyInterest = annualInterest/PERCENT/MONTH_IN_YEAR;


        System.out.print("Period (Years : ) :");
        byte years = scanner.nextByte ();
        int numberOfPayments = years * MONTH_IN_YEAR;


        double mortgage = principle
                * (monthlyInterest * Math.pow ( 1 + monthlyInterest, numberOfPayments ) )
         / (Math.pow (  1 + monthlyInterest, numberOfPayments));

        String mortgageFormatted = NumberFormat.getCurrencyInstance ().format ( 1500000 );
        System.out.println ("Mortgage : " + mortgageFormatted);



    }
}