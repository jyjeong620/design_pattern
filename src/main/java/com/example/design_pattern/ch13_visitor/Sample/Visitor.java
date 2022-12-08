package com.example.design_pattern.ch13_visitor.Sample;

public abstract class Visitor {
    public abstract void visit(File file);
    public abstract void visit(Directory directory);
}
