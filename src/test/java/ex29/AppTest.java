package ex29;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void doCalculation() {
        App app = new App();

        double actual = app.doCalculation(4);

        assertEquals(18, actual);
    }
}