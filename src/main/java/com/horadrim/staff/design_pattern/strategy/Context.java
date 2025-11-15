package com.horadrim.staff.design_pattern.strategy;

public class Context {
    public void executeStrategy(Strategy strategy){
        strategy.doStrategy();
    }
}
