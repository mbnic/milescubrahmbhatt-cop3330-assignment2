/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Nicolas Milescu-Brahmbhatt
 */

package ex34;

import java.util.Locale;
import java.util.Scanner;
import java.util.ArrayList;

public class App {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();

        ArrayList<String> names = new ArrayList<String>();
        myApp.fillList(names);

        //inital print
        myApp.printList(names);

        String delete = myApp.getUserInput();

        myApp.deleteName(names, delete);

        myApp.printList(names);
    }

    public void deleteName(ArrayList<String> names, String delName) {
        for (int i = 0; i < names.size(); i++) {
            if (delName.toUpperCase(Locale.ROOT).equals(names.get(i).toUpperCase(Locale.ROOT)))
                names.remove(i);
        }
    }

    public String getUserInput() {
        System.out.print("\nEnter an employee name to remove: ");
        return in.nextLine();
    }

    public void printList(ArrayList<String> names) {
        int i = 0;

        System.out.printf("\nThese are the %d employees:\n", names.size());
        while (i < names.size()) {
            System.out.println(names.get(i));
            i++;
        }
    }

    public void fillList(ArrayList<String> arr) {
        arr.add("John Smith");
        arr.add("Jackie Jackson");
        arr.add("Chris Jones");
        arr.add("Amanda Cullen");
        arr.add("Jeremy Goodwin");
    }
}
