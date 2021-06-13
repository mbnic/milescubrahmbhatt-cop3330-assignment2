/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Nicolas Milescu-Brahmbhatt
 */
package ex35;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class App {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();
        ArrayList<String> names = new ArrayList<String>();

        myApp.getNames(names);
        String winner = myApp.pickWinner(names);

        myApp.printOut(winner);

    }

    public void printOut(String winner) {
        System.out.printf("The winner is ... " + winner);
    }

    public String pickWinner(ArrayList<String> names) {
        Random rand = new Random();
        int winIndex = rand.nextInt(names.size());

        return names.get(winIndex);
    }

    public void getNames(ArrayList<String> arr) {
        while (true) {
            System.out.print("Enter a name: ");
            String input = in.nextLine();

            if (input.isBlank())
                break;
            else
                arr.add(input);
        }
    }
}
