/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Nicolas Milescu-Brahmbhatt
 */

package ex25;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();

        String userPass = myApp.getPassword();
        int strength = myApp.passwordValidator(userPass);
        System.out.println(strength);
    }

    public int passwordValidator(String pass) {

        //very weak
        if (pass.matches("[0-9]+") && pass.length() < 8)
            return 1;

        //weak
        if (pass.matches("[a-z A-Z]+") && pass.length() < 8)
            return 2;


        if (pass.length() >= 8) {

            Pattern p = Pattern.compile("[^A-Za-z0-9 ]");
            Matcher m = p.matcher(pass);

            if (m.find())
                return 4;

            if (pass.matches("[0-9 A-Z a-z]+"))
                return 3;
        }

        return 0;
    }

    public String getPassword() {
        System.out.print("Please enter your password: ");
        return in.next();

    }
}
