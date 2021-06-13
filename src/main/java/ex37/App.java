/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Nicolas Milescu-Brahmbhatt
 */
package ex37;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class App {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();
        Password userPass = new Password();

        myApp.getInfo(userPass);
        String password = myApp.generatePass(userPass);

        System.out.println(password);
    }

    public String generatePass(Password passInfo) {
        ArrayList<String> charType = new ArrayList<>();
        charType.add("0123456789");
        charType.add("!@#$%^&*_=+-/");
        charType.add("abcdefghijklmnopqrstuvwxyz");

        Random rand = new Random();

        char[] result = new char[passInfo.length];
        int randCharType;
        int numSpecialChars = 0;
        int numValues = 0;
        int index;

        System.out.println(charType.get(1));

        for (int i = 0; i < passInfo.length; i++) {

            randCharType = rand.nextInt(3);

            if (randCharType == 0 && numValues < passInfo.numbers) {
                index = rand.nextInt(charType.get(0).length());
                result[i] = charType.get(0).charAt(index);
                numValues++;
            }

            if (randCharType == 1 && numSpecialChars < passInfo.special) {
                index = rand.nextInt(charType.get(1).length());
                result[i] = charType.get(1).charAt(index);
                numSpecialChars++;
            }
            else {
                index = rand.nextInt(charType.get(2).length());
                result[i] = charType.get(2).charAt(index);
            }

        }

        return new String(result);
    }

    public void getInfo(Password pass) {
        System.out.print("What's the minimum length? ");
        pass.length = in.nextInt();

        System.out.print("How many special characters? ");
        pass.special = in.nextInt();

        System.out.print("How many numbers? ");
        pass.numbers = in.nextInt();
    }

}
