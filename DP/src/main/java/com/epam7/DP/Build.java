package com.epam7.DP;

public class Build {
    private Strategy strategy;
    
    public Build(Strategy strategy) {
        this.strategy = strategy;
    }
    
    public String executeStrategy(String location) {
        return strategy.build(location);
    }
}
