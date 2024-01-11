package StrategyPattern_Duck.behaviours.behaviourImplementation;

import StrategyPattern_Duck.behaviours.QuackBehaviour;

public class Squeak implements QuackBehaviour {
    public void quack() {
        System.out.println("Squeak");
    }
}
