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
        double[] numArray = new double[5];

        numArray = myApp.getNums(numArray);
        double result = myApp.addNums(numArray);
        myApp.printOutput(result);
    }

    public void printOutput(double output) {
        System.out.printf("The total is %.2f.", output);
    }

    public double addNums(double[] arr) {
        double res = 0;
        for (int i = 0; i < 5; i++) {
            res += arr[i];
        }

        return res;
    }

    public double[] getNums(double[] arr) {
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter a number: ");
            arr[i] = in.nextInt();
        }

        return arr;
    }
}
