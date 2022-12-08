package com.example.design_pattern.ch13_visitor.A1;

public abstract class Visitor {
    public abstract void visit(File file);
    public abstract void visit(Directory directory);
}
