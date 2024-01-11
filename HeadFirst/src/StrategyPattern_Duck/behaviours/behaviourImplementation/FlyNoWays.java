package StrategyPattern_Duck.behaviours.behaviourImplementation;

import StrategyPattern_Duck.behaviours.FlyBehaviour;

public class FlyNoWays implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("I can't fly");
    }
}
