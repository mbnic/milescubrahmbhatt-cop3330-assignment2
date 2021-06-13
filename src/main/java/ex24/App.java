/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Nicolas Milescu-Brahmbhatt
 */

package ex24;
import java.util.Scanner;
import java.util.Arrays;

public class App {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();
        Words userWords = new Words();

        myApp.getStrings(userWords);

        boolean result = myApp.isAnagram(userWords.s1, userWords.s2);

        myApp.output(result, userWords);
    }

    public void getStrings(Words words) {
        System.out.print("Enter two strings and I'll tell you if they are anagrams: \n" +
                "Enter the first string: ");
        words.s1 = in.next();

        System.out.print("Enter the second string: ");
        words.s2 = in.next();
    }

    public boolean isAnagram(String s1, String s2) {
        if (s1.length() == s2.length()) {
            char[] s1Arr = s1.toCharArray();
            char[] s2Arr = s2.toCharArray();

            Arrays.sort(s1Arr);
            Arrays.sort(s2Arr);

            return Arrays.equals(s1Arr, s2Arr);
        }

        return false;
    }

    public void output(Boolean result, Words words) {
        if (result)
            System.out.printf("%s and %s are anagrams.", words.s1, words.s2);
        else
            System.out.printf("%s and %s are not anagrams", words.s1, words.s2);
    }
}
