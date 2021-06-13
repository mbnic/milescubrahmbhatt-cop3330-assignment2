package ex38;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();
        ArrayList<Integer> evenNums = new ArrayList<>();

        String[] values = myApp.getList();

        myApp.filterEvenNumbers(values, evenNums);
        myApp.printOutput(evenNums);
    }

    public void printOutput(ArrayList<Integer> evenNums) {
        System.out.print("The even numbers are ");

        for (int i = 0; i < evenNums.size(); i++) {
            if (i == evenNums.size() - 1)
                System.out.printf("%d.", evenNums.get(i));
            else
                System.out.print(evenNums.get(i) + " ");

        }
    }

    public void filterEvenNumbers(String[] values, ArrayList<Integer> evenNums) {
        for (int i = 0; i < values.length; i++) {
            if (Integer.parseInt(values[i]) % 2 == 0)
                evenNums.add(Integer.parseInt(values[i]));

        }
    }

    public String[] getList() {
        System.out.print("Enter a list of numbers, separated by spaces: ");
        String input = in.nextLine();

        return input.split(" ");
    }
}
