/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Nicolas Milescu-Brahmbhatt
 */
package ex39;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class App {
    public static void main(String[] args) {
        App myApp = new App();
        ArrayList<HashMap<String, String>> employees = new ArrayList<>();

        Map<String, String> test = new HashMap<>();

        myApp.fillEmployeeInfo(employees);
    }

    public void fillEmployeeInfo(ArrayList<HashMap<String, String>> employees) {

        HashMap<String, String> jacqMap = new HashMap<>();
        jacqMap.put("firstname", "Jacquelyn");
        jacqMap.put("lastname", "Jackson");
        jacqMap.put("position", "DBA");
        jacqMap.put("separation", " ");
        employees.add(jacqMap);

        HashMap<String, String> jakeMap = new HashMap<>();
        jacqMap.put("firstname", "Jake");
        jacqMap.put("lastname", "Jacobson");
        jacqMap.put("position", "Programmer");
        jacqMap.put("separation", " ");
        employees.add(jakeMap);

        HashMap<String, String> johnMap = new HashMap<>();
        jacqMap.put("firstname", "John");
        jacqMap.put("lastname", "Johnson");
        jacqMap.put("position", "Manager");
        jacqMap.put("separation", "2016-12-31");
        employees.add(johnMap);

        HashMap<String, String> michMap = new HashMap<>();
        jacqMap.put("firstname", "Michaela");
        jacqMap.put("lastname", "Michaelson");
        jacqMap.put("position", "District Manager");
        jacqMap.put("separation", "2015-12-19");
        employees.add(michMap);

        HashMap<String, String> sallyMap = new HashMap<>();
        jacqMap.put("firstname", "Sally");
        jacqMap.put("lastname", "Weber");
        jacqMap.put("position", "Web Developer");
        jacqMap.put("separation", "2015-12-18");
        employees.add(sallyMap);

        HashMap<String, String> touMap = new HashMap<>();
        jacqMap.put("firstname", "Tou");
        jacqMap.put("lastname", "Xiong");
        jacqMap.put("position", "Software Engineer");
        jacqMap.put("separation", "2016-10-05");
        employees.add(jacqMap);
    }





}
