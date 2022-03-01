package Strategy.calculator;

public class Add implements Calculate {

    @Override
    public int calculate(int a, int b) {
        return a + b;
    }
    
}
