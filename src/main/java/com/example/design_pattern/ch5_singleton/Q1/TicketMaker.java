package com.example.design_pattern.ch5_singleton.Q1;

public class TicketMaker {
    private int ticket = 1000;

    public int getNextTicketNumber() {
        return ticket++;
    }
}
