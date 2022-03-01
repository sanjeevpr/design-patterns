package Strategy.calculator;

public class Subtract implements Calculate {

    @Override
    public int calculate(int a, int b) {
        return a - b;
    }
    
}
