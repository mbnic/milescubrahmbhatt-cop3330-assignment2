package ex39;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void main() {
        App app = new App();
        ArrayList<HashMap<String, String>> employees = new ArrayList<>();

        app.fillEmployeeInfo(employees);

        String expected = """
                Name                 Position             Separation Date
                Jacquelyn Jackson    DBA                             \s
                Jake Jacobson        Programmer                      \s
                John Johnson         Manager              2016-12-31 \s
                Michaela Michaelson  District Manager     2015-12-19 \s
                Sally Weber          Web Developer        2015-12-18 \s
                Tou Xiong            Software Engineer    2016-10-05 \s""" + "\n";


        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        app.printOut(employees);

        assertEquals(expected, out.toString());
    }
}