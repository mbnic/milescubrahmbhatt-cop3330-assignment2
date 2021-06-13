/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Nicolas Milescu-Brahmbhatt
 */
package ex36;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();
        ArrayList<Integer> list = new ArrayList<>();
        Calculator calc = new Calculator();

        myApp.getValues(list);
        myApp.printValues(list);
        myApp.printOutput(list, calc);
    }

    public void printOutput(ArrayList<Integer> list, Calculator calc) {
        System.out.println("\nThe average is " + calc.average(list));
        System.out.println("The minimum is " + calc.min(list));
        System.out.println("The maximum is " + calc.max(list));
        System.out.printf("The standard deviation is %.2f", calc.std(list));
    }

    public void printValues(ArrayList<Integer> list) {
        System.out.print("Numbers: ");
        int i;

        for (i = 0; i < list.size(); i++) {
            if (i == (list.size() - 1))
                System.out.printf("%d", list.get(i));

            else
                System.out.printf("%d, ", list.get(i));
        }
    }

    public void getValues(ArrayList<Integer> list) {
        System.out.println("When you are finished enter " + "\"done\"");

        while (true) {
            System.out.print("Enter a number: ");
            String input = in.next();
            if (input.equals("done"))
                break;

            if (input.matches("[a-z A-Z]+") || input.equals("0"))
                System.out.println("ERROR: enter a NUMBER greater than 0");

            else
                list.add(Integer.parseInt(input));

        }
    }
}
