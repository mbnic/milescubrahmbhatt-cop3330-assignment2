package ex24;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test
    void isAnagram_returns_correct_result() {
        Words words = new Words();
        words.s1 = "fried";
        words.s2 = "fired";

        App app = new App();

        assertTrue(app.isAnagram(words.s1, words.s2));
    }
}