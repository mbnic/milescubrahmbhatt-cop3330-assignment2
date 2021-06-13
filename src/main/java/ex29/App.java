/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Nicolas Milescu-Brahmbhatt
 */

package ex29;

import java.util.Scanner;

public class App {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();

        int userInput = myApp.getInput();
        double result = myApp.doCalculation(userInput);
        myApp.printOut(result);

    }

    public void printOut(double output) {
        System.out.printf("It will take %.0f years to double your initial investment.", output);
    }

    public double doCalculation(int userInput) {
        return (72.0 / userInput);
    }

    public int getInput() {
        String input;

        while (true) {
            System.out.print("What is the rate of return? ");
            input = in.nextLine();

            if (input.matches("[a-z A-Z]+"))
                System.out.println("Sorry. That's not a valid input.");

            else if (input.equals("0"))
                System.out.println("Sorry. That's not a valid input.");

            else
                break;
        }

        return Integer.parseInt(input);
    }
}
