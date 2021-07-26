package ex40;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        App myApp = new App();
        ArrayList<HashMap<String, String>> employees = new ArrayList<>();

        myApp.fillEmployeeInfo(employees);

        System.out.printf("Enter a search string: ");
        Scanner in = new Scanner(System.in);
        String query = in.next().toUpperCase(Locale.ROOT);
        System.out.println("Results: \n");

        myApp.printOut(employees, query);
    }

    public void printOut(ArrayList<HashMap<String, String>> employees, String query) {

        String n = "Name";
        String pos = "Position";
        String sep = "Separation Date";

        System.out.printf("%-20s %-20s %-12s\n", n, pos, sep);

        for (int i = 0; i < employees.size(); i++) {
            String name = employees.get(i).get("firstname") + " " + employees.get(i).get("lastname");

            if (name.toUpperCase(Locale.ROOT).contains(query)) {
                String position = employees.get(i).get("position");
                String separation = employees.get(i).get("separation");

                System.out.printf("%-20s %-20s %-12s\n", name, position, separation);
            }
        }
    }


    public void fillEmployeeInfo(ArrayList<HashMap<String, String>> employees) {

        HashMap<String, String> jacqMap = new HashMap<>();
        jacqMap.put("firstname", "Jacquelyn");
        jacqMap.put("lastname", "Jackson");
        jacqMap.put("position", "DBA");
        jacqMap.put("separation", " ");
        employees.add(jacqMap);

        HashMap<String, String> jakeMap = new HashMap<>();
        jakeMap.put("firstname", "Jake");
        jakeMap.put("lastname", "Jacobson");
        jakeMap.put("position", "Programmer");
        jakeMap.put("separation", " ");
        employees.add(jakeMap);

        HashMap<String, String> johnMap = new HashMap<>();
        johnMap.put("firstname", "John");
        johnMap.put("lastname", "Johnson");
        johnMap.put("position", "Manager");
        johnMap.put("separation", "2016-12-31");
        employees.add(johnMap);

        HashMap<String, String> michMap = new HashMap<>();
        michMap.put("firstname", "Michaela");
        michMap.put("lastname", "Michaelson");
        michMap.put("position", "District Manager");
        michMap.put("separation", "2015-12-19");
        employees.add(michMap);

        HashMap<String, String> sallyMap = new HashMap<>();
        sallyMap.put("firstname", "Sally");
        sallyMap.put("lastname", "Weber");
        sallyMap.put("position", "Web Developer");
        sallyMap.put("separation", "2015-12-18");
        employees.add(sallyMap);

        HashMap<String, String> touMap = new HashMap<>();
        touMap.put("firstname", "Tou");
        touMap.put("lastname", "Xiong");
        touMap.put("position", "Software Engineer");
        touMap.put("separation", "2016-10-05");
        employees.add(touMap);
    }


}
