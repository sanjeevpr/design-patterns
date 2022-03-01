package Strategy.calculator;

public class Calculator {
    Calculate calculate;

    public void setCalculate(Calculate calculate) {
        this.calculate = calculate;
    }

    public int getCalulation(int a, int b) {
        return calculate.calculate(a, b);
    }
}
