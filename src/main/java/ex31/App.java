/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Nicolas Milescu-Brahmbhatt
 */

package ex31;

import java.util.Scanner;

public class App {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();
        Person p = new Person();
        myApp.getInfo(p);
        int[] bpmArray = new int[9];
        bpmArray = myApp.doCalculations(p, bpmArray);
        myApp.printOutput(bpmArray);
    }

    public void printOutput(int[] arr) {
        System.out.format("%s %5s %5s", "Intensity", "|","Rate");
        System.out.printf("\n%s%s%s", "--------------", "|", "---------");

        int intensity = 55;
        int i = 0;

        while(intensity <= 95) {
            System.out.printf("\n%d%% %11s %5d", intensity, "|", arr[i]);

            i++;
            intensity += 5;
        }
    }

    public int[] doCalculations(Person p, int[] arr) {
        double intensity = 0.55;
        double result;
        int i = 0;

        while(i < 9) {

            result = (((220 - p.age) - p.restingPulse) * intensity) + p.restingPulse;

            arr[i] = (int)Math.round(result);
            intensity += .05;
            i++;
        }

        return arr;
    }

    public void getInfo(Person p) {
        String input;

        while (true) {
            System.out.print("Resting pulse: ");
            input = in.nextLine();

            if (input.matches("[a-z A-Z]+") || input.equals("0") || input.isBlank())
                System.out.println("Sorry. That's not a valid input.");

            else {
                p.restingPulse = Integer.parseInt(input);
                break;
            }
        }

        while (true) {
            System.out.print("Age: ");
            input = in.nextLine();

            if (input.matches("[a-z A-Z]+") || input.equals("0") || input.isBlank())
                System.out.println("Sorry. That's not a valid input.");

            else {
                p.age = Integer.parseInt(input);
                break;
            }
        }

        System.out.print("\n");
    }
}
