/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Nicolas Milescu-Brahmbhatt
 */

package ex30;

import java.util.Scanner;

public class App {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();
        int i, j;

        for (i = 1; i <= 12; i++) {
            System.out.print("\n");
            for (j = 1; j <= 12; j++) {
                System.out.printf("%5d", i * j);
            }
        }
    }
}
