package ex34;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void deleteName() {

        App app = new App();


        ArrayList<String> arr = new ArrayList<>();
        arr.add("John Smith");
        arr.add("Jackie Jackson");
        arr.add("Amanda Cullen");
        arr.add("Jeremy Goodwin");

        ArrayList<String> names = new ArrayList<>();
        app.fillList(names);

        app.deleteName(names, "chris jones");

        assertEquals(arr, names);

    }
}