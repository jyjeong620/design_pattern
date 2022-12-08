package com.example.design_pattern.ch10_strategy.Sample;

public interface Strategy {
    public abstract Hand nextHand();
    public abstract void study(boolean win);
}
