package com.example.design_pattern.ch23_interpreter.Sample;

public abstract class Node {
    public abstract void parse(Context context) throws ParseException;
}
