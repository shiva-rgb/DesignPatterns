package StrategyPattern_Duck;

import StrategyPattern_Duck.Duck.Duck;
import StrategyPattern_Duck.Duck.Ducks.MallardDuck;
import StrategyPattern_Duck.Duck.Ducks.RubberDuck;
import StrategyPattern_Duck.behaviours.behaviourImplementation.FlyNoWays;
import StrategyPattern_Duck.behaviours.behaviourImplementation.FlyWithRockets;
import StrategyPattern_Duck.behaviours.behaviourImplementation.Squeak;

public class MiniDuckSimulator {

    public static void main(String[] args){
        Duck d = new RubberDuck();
        d.performQuack();
        d.performFly();
        d.setFlyBehaviour(new FlyWithRockets());
        d.performFly();

    }
}
