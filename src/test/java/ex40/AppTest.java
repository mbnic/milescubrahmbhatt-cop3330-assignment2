package ex40;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void printOut() {
        App app = new App();
        ArrayList<HashMap<String, String>> employees = new ArrayList<>();
        app.fillEmployeeInfo(employees);

        String expected = """
                Name                 Position             Separation Date
                Jacquelyn Jackson    DBA                             \s
                Jake Jacobson        Programmer                      \s

                """;

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));


        app.printOut(employees, "Jac");

        assertEquals(expected, out.toString());
    }
}