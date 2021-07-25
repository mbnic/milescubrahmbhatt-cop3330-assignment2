package ex26;

public class PaymentCalculator {

    public double calculateMonthsUntilPaidOff(float b, float i, float p) {
        double n;

        //n = -(1/30) * log(1 + b/p * (1 - (1 + i)^30)) / log(1 + i)
        //how is this just .something off its exact

        double firstPart = -(1.0 / 30.0);
        double secondPart = Math.log(1.0 + ((b/p) * (1.0 - Math.pow(1.0 + i, 30.0))));
        double thirdPart = Math.log(1.0 + i);

        return (firstPart * secondPart) / thirdPart;
    }
}
