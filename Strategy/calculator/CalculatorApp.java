package Strategy.calculator;

public class CalculatorApp {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.setCalculate(new Add());
        int addResult = calculator.getCalulation(5, 2);
        System.out.println(addResult);

        calculator.setCalculate(new Subtract());
        int subtractResult = calculator.getCalulation(5, 2);
        System.out.println(subtractResult);
    }
}