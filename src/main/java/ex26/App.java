/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Nicolas Milescu-Brahmbhatt
 */

package ex26;
import java.util.Scanner;

public class App {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();
        CreditCard userCard = new CreditCard();
        PaymentCalculator calculator = new PaymentCalculator();

        myApp.getCCinfo(userCard);

        double months = calculator.calculateMonthsUntilPaidOff(userCard.balance, userCard.dailyRate, userCard.monthlyPayment);

        myApp.printOutput(months);
    }

    public void printOutput(double months) {
        System.out.printf("It will take you %.0f months to pay off this card.", months);
    }

    public void getCCinfo(CreditCard card) {
        System.out.print("What is your balance? ");
        card.balance = in.nextFloat();

        System.out.print("What is the APR on the card (as a percent)? ");
        card.dailyRate = ((in.nextFloat() / 100) / 365);

        System.out.print("What is the monthly payment you can make? ");
        card.monthlyPayment = in.nextFloat();
    }
}
