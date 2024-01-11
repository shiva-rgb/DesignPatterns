package StrategyPattern_Duck.behaviours.behaviourImplementation;

import StrategyPattern_Duck.behaviours.QuackBehaviour;

public class Quack implements QuackBehaviour {
    public void quack() {
        System.out.println("Quack");
    }
}
