package StrategyPattern_Duck.behaviours.behaviourImplementation;

import StrategyPattern_Duck.behaviours.FlyBehaviour;

public class FlyWithRockets implements FlyBehaviour {
    public void fly() {
        System.out.println("I fly with rockets");
    }
}
