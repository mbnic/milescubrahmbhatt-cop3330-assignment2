package ex26;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test
    void paymentCalculator_returns_right_answer() {
        PaymentCalculator calc = new PaymentCalculator();
        calc.calculateMonthsUntilPaidOff(5000, 12, 100);

        assertEquals(69.0, calc.getResult());
    }
}