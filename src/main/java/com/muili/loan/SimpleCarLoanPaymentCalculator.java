package com.muili.loan;

import java.util.Scanner;

public class SimpleCarLoanPaymentCalculator {
    public static void main(String[] args) {

        double remainingBalance;
        double monthlyPayment;
        double interest;
        int months;
        double monthlyBalance;


        Scanner input = new Scanner(System.in);
        System.out.println("Enter your car loan amount: ");
        double carLoanAmount;
        carLoanAmount = input.nextInt();

        System.out.println("Enter your car interest rate: ");
        double interestRate;
        interestRate = input.nextInt();

        System.out.println("Enter your car loan tenor: ");
        int loanTenor;
        loanTenor = input.nextInt();

        System.out.println("Enter your car down payment: ");
        double downPayment;
        downPayment = input.nextInt();

        if (carLoanAmount <= 0) {
            System.out.println("Loan amount must be greater than 0.");
        } else if (interestRate <= 0) {
            System.out.println("Annual interest rate must be greater than 0.");
        } else if (loanTenor <= 0) {
            System.out.println("car loan tenor must be greater than 0.");
        } else if (downPayment > carLoanAmount) {
            System.out.println("Invalid transaction: The car loan can be paid in full.");
        }

            remainingBalance = carLoanAmount - downPayment;
            months = loanTenor * 12;
            monthlyBalance = remainingBalance/months;
            interest = (monthlyBalance * interestRate)/100;
            monthlyPayment = monthlyBalance + interest;
            System.out.println("The monthly payments for your car loan is: " + "$"+ monthlyPayment);

            System.exit(1);

        }
    }
