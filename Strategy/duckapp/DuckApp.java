package Strategy.duckapp;

import Strategy.duckapp.Duck.DecoyDuck;
import Strategy.duckapp.Duck.Duck;
import Strategy.duckapp.Duck.MallardDuck;
import Strategy.duckapp.Fly.FlyNoWay;
import Strategy.duckapp.Fly.FlyWithWings;
import Strategy.duckapp.Quack.MuteQuack;
import Strategy.duckapp.Quack.Quack;

public class DuckApp {
    public static void main(String[] args) {

        Duck mallardDuck = new MallardDuck();
        mallardDuck.display();
        mallardDuck.swim();
        mallardDuck.setFlyBehaviour(new FlyWithWings());
        mallardDuck.setQuackBehaviour(new Quack());

        Duck decoyDuck = new DecoyDuck();
        decoyDuck.display();
        decoyDuck.swim();
        decoyDuck.setFlyBehaviour(new FlyNoWay());
        decoyDuck.setQuackBehaviour(new MuteQuack());
    }
}