/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 first_name last_name
 */

package ex25;
import java.util.Scanner;

public class App {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();

        String userPass = myApp.getPassword();
        int strength = myApp.passwordValidator(userPass);
        System.out.println(strength);


    }

    public int passwordValidator(String pass) {

        String specialChars = "!@#$%&*()'+,-./:;<=>?[]^_`{|}";
        char[] specialCharsArr = pass.toCharArray();

        //very weak
        if (pass.matches("[0-9]+") && pass.length() < 8)
            return 1;

        //weak
        if (pass.matches("[a-z A-Z]+") && pass.length() < 8)
            return 2;

        //strong
        if (pass.matches("[0-9 A-Z a-z]+") && pass.length() >= 8) {

            //very strong
            for (int i = 0; i < pass.length(); i++) {
                if (pass.contains(Character.toString(specialChars.charAt(i))))
                    return 4;
            }

            return 3;
        }




        return 0;
    }

    public String getPassword() {
        System.out.print("Please enter your password: ");
        return in.next();

    }
}
