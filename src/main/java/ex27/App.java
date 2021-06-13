/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Nicolas Milescu-Brahmbhatt
 */

package ex27;

import java.util.Scanner;

public class App {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();
        UserInfo user = new UserInfo();
        Validation validator = new Validation();

        myApp.getUserInfo(user);

        validator.validateInput(user);

    }

    public void getUserInfo(UserInfo user) {
        System.out.print("Enter the first name: ");
        user.firstName = in.nextLine();

        System.out.print("Enter the last name: ");
        user.lastName = in.nextLine();

        System.out.print("Enter the ZIP code: ");
        user.zip = in.nextLine();

        System.out.print("Enter the employee ID: ");
        user.id = in.nextLine();
    }


}
