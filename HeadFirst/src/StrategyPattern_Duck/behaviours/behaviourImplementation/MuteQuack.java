package StrategyPattern_Duck.behaviours.behaviourImplementation;

import StrategyPattern_Duck.behaviours.QuackBehaviour;

public class MuteQuack implements QuackBehaviour {
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
