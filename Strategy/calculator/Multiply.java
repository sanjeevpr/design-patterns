package Strategy.calculator;

public class Multiply implements Calculate {

    @Override
    public int calculate(int a, int b) {
        return a * b;
    }
    
}
