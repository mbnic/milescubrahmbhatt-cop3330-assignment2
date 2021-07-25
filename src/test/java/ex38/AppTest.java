package ex38;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void filterEvenNumbers() {
        App app = new App();

        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(2);
        expected.add(4);
        expected.add(6);

        String[] vals = {"1", "2", "3", "4", "5", "6"};
        ArrayList<Integer> actual = new ArrayList<>();
        app.filterEvenNumbers(vals, actual);

        assertEquals(expected, actual);


    }
}