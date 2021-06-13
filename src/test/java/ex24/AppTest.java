package ex24;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void isAnagram_returns_correctly_forAnagrams() {
        App myApp  = new App();

        boolean actual = myApp.isAnagram("note", "tone");
        boolean expected = true;

        assertEquals(expected, actual);
    }

    @Test
    void isAnagram_returns_false_forNotAnagrams() {
        App myApp  = new App();

        boolean actual = myApp.isAnagram("note", "bone");
        boolean expected = false;

        assertEquals(expected, actual);
    }
}