package StrategyPattern_Duck.Duck.Ducks;

import StrategyPattern_Duck.Duck.Duck;
import StrategyPattern_Duck.behaviours.behaviourImplementation.FlyNoWays;
import StrategyPattern_Duck.behaviours.behaviourImplementation.Squeak;

public class RubberDuck extends Duck {

    public RubberDuck(){
        quackBehaviour = new Squeak();
        flyBehaviour = new FlyNoWays();
    }

    public void display() {
        System.out.println("I'm a rubber duck");
    }
}
