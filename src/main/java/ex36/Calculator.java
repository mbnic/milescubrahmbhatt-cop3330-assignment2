package ex36;

import java.util.ArrayList;
import java.util.Collections;

public class Calculator {

    public double std(ArrayList<Integer> vals) {
        int i = 0;
        double sum = 0;
        double std = 0;
        double mean;

        while (i < vals.size()) {
            sum += vals.get(i);
            i++;
        }

        mean = sum/vals.size();

        i = 0;
        while (i < vals.size()) {
            std += Math.pow(vals.get(i) - mean, 2);
            i++;
        }

        return Math.sqrt(std/vals.size());
    }

    public double average(ArrayList<Integer> vals) {
        double res = 0;
        int i = 0;

        while (i < vals.size()) {
            res += vals.get(i);
            i++;
        }

        return (res/vals.size());
    }

    public int min(ArrayList<Integer> vals) {
        return Collections.min(vals);
    }

    public int max(ArrayList<Integer> vals) {
        return Collections.max(vals);
    }

}
