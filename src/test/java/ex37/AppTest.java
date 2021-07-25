package ex37;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void generatePass() {
        App app = new App();

        Password info = new Password();
        info.numbers = 2;
        info.length = 8;
        info.special = 2;

        String pass = app.generatePass(info);
        int num = 0;

        for (int i = 0; i < pass.length(); i++) {
            if (Character.isDigit(pass.charAt(i)))
                num++;
        }

        assertEquals(info.length, pass.length());
        assertEquals(info.numbers, num);

    }
}