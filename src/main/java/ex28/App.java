/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Nicolas Milescu-Brahmbhatt
 */

package ex28;
import java.util.Scanner;

public class App {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();
        int[] numArray = new int[5];

        numArray = myApp.getNums(numArray);
        int result = myApp.addNums(numArray);
        myApp.printOutput(result);
    }

    public void printOutput(int output) {
        System.out.printf("The total is %d.", output);
    }

    public int addNums(int[] arr) {
        int res = 0;
        for (int i = 0; i < 5; i++) {
            res += arr[i];
        }

        return res;
    }

    public int[] getNums(int[] arr) {
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter a number: ");
            arr[i] = in.nextInt();
        }

        return arr;
    }
}
