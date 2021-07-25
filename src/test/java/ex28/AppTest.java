package ex28;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void addNums() {
        App app = new App();

        double[] nums = {1,2,3,4,5};

        double actual = app.addNums(nums);

        assertEquals(15.00, actual);
    }
}