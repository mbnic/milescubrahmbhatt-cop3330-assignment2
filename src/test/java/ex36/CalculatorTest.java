package ex36;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void std() {
        Calculator calc = new Calculator();
        ArrayList<Integer> vals = new ArrayList<>();
        vals.add(100);
        vals.add(200);
        vals.add(1000);
        vals.add(300);

        double actual = calc.std(vals);
        double expected = 353.55;

        assertEquals(expected, actual);
    }

    @Test
    void average() {
        Calculator calc = new Calculator();
        ArrayList<Integer> vals = new ArrayList<>();
        vals.add(100);
        vals.add(200);
        vals.add(1000);
        vals.add(300);

        double actual = calc.average(vals);
        double expected = 400.0;

        assertEquals(expected, actual);
    }

    @Test
    void min() {
        Calculator calc = new Calculator();
        ArrayList<Integer> vals = new ArrayList<>();
        vals.add(100);
        vals.add(200);
        vals.add(1000);
        vals.add(300);

        double actual = calc.min(vals);
        double expected = 100;

        assertEquals(expected, actual);
    }

    @Test
    void max() {
        Calculator calc = new Calculator();
        ArrayList<Integer> vals = new ArrayList<>();
        vals.add(100);
        vals.add(200);
        vals.add(1000);
        vals.add(300);

        double actual = calc.max(vals);
        double expected = 1000;

        assertEquals(expected, actual);
    }
}