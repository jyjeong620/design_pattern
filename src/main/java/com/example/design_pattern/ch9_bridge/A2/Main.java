package com.example.design_pattern.ch9_bridge.A2;

public class Main {
    public static void main(String[] args) {
        CountDisplay d = new CountDisplay(new FileDisplayImpl("star.txt"));
        d.multiDisplay(3);
    }
}
