/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Nicolas Milescu-Brahmbhatt
 */
package ex33;

import java.util.Scanner;
import java.util.Random;

public class App {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();

        System.out.printf("What's your question?\n> ");
        String whatever = in.next();

        String[] answers = new String[4];
        myApp.fillAnswers(answers);
        int choice = myApp.getChoice();
        System.out.println("\n" + answers[choice]);
    }

    public int getChoice() {
        Random rand = new Random();
        return rand.nextInt(4);
    }

    public void fillAnswers(String[] arr) {
        arr[0] = "Yes";
        arr[1] = "No";
        arr[2] = "Maybe";
        arr[3] = "Ask again later.";
    }
}
