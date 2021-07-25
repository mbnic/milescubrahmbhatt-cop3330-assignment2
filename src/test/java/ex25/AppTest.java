package ex25;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void passwordValidator_returns_correctStrengths() {
        String veryWeak = "123456";
        String weak = "ABcdef";
        String strong = "a1b256789";
        String veryStrong = "1997nJIO@!for";

        App app = new App();

        assertEquals(1, app.passwordValidator(veryWeak));
        assertEquals(2, app.passwordValidator(weak));
        assertEquals(3, app.passwordValidator(strong));
        assertEquals(4, app.passwordValidator(veryStrong));
    }
}