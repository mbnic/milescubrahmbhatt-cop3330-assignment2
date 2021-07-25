package ex31;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void doCalculations() {
        App app = new App();
        Person p = new Person();
        p.restingPulse = 65;
        p.age = 22;

        int[] bpm = new int[9];
        bpm = app.doCalculations(p, bpm);

        assertEquals(138 ,bpm[0]);
        assertEquals(145 ,bpm[1]);
        assertEquals(151 ,bpm[2]);
    }
}