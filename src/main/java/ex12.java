/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 James Moore
 */

import java.util.Scanner;

public class ex12 {
    public static void main(String[] args){
        Scanner inScan = new Scanner(System.in);

        System.out.print("Enter the principle: ");
        double principle = inScan.nextDouble();
        System.out.print("Enter the rate of interest: ");
        double rate = inScan.nextDouble();
        System.out.print("Enter the number of years: ");
        int time = inScan.nextInt();

        double result = principle * (1.0 + ( (rate/100) * time) );
        int hold = (int) (result * 1000000);
        result = Math.ceil( (hold / 10000.0) ) / 100.0;

        System.out.printf("After %d years at %.2f%%, the investment will be worth $%.2f.", time, rate, result);

}
