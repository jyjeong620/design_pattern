package com.example.design_pattern.ch9_bridge.A1;

public class Main {
    public static void main(String[] args) {
        RandomCountDisplay d = new RandomCountDisplay(new StringDisplayImpl("Hello, Korea."));
        d.randomDisplay(10);
    }
}
