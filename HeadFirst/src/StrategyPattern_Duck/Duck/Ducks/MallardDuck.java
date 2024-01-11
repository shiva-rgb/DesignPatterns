package StrategyPattern_Duck.Duck.Ducks;

import StrategyPattern_Duck.Duck.Duck;
import StrategyPattern_Duck.behaviours.behaviourImplementation.FlyWithWings;
import StrategyPattern_Duck.behaviours.behaviourImplementation.Quack;

public class MallardDuck extends Duck {

    public MallardDuck(){
        quackBehaviour = new Quack();
        flyBehaviour  = new FlyWithWings();
    }

    public void display() {
        System.out.println("I'm a MallardDuck");
    }


}
