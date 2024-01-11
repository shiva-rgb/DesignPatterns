package StrategyPattern_Duck.Duck;

import StrategyPattern_Duck.behaviours.FlyBehaviour;
import StrategyPattern_Duck.behaviours.QuackBehaviour;

public abstract class Duck {

    public FlyBehaviour flyBehaviour;
    public QuackBehaviour quackBehaviour;

    public void performFly(){
        flyBehaviour.fly();
    }

    public void performQuack(){
        quackBehaviour.quack();
    }

    public abstract void display();

    public void swim(){
        System.out.println("All ducks can swim");
    }

    public void setFlyBehaviour(FlyBehaviour fb){
        flyBehaviour = fb;
    }

    public void setQuackBehaviour(QuackBehaviour qb){
        quackBehaviour = qb;
    }
}
