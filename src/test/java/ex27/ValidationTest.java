package ex27;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class ValidationTest {

    @Test
    void validateID_prints_error() {
        Validation valid = new Validation();

        String expected = "The employee ID must be in the format of AA-1234"  + "\n";

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        valid.validateID("1234A6");


        assertEquals(expected, out.toString());
    }

    @Test
    void validateZipcode() {
        Validation valid = new Validation();

        String expected = "The zipcode must be a 5 digit number."  + "\n";

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        valid.validateZipcode("123");


        assertEquals(expected, out.toString());
    }

    @Test
    void validateFirstName() {
        Validation valid = new Validation();


        String expected = "The first name must be at least 2 characters long."  + "\n";

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        valid.validateFirstName("A");

        assertEquals(expected, out.toString());
    }

    @Test
    void validateLastName() {
        Validation valid = new Validation();


        String expected = "The last name must be at least 2 characters long."  + "\n";

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        valid.validateLastName("b");

        assertEquals(expected, out.toString());
    }
}