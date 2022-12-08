package com.example.design_pattern.ch6_prototype.A2.framework;

public interface Product {
    public abstract void use(String s);
    public abstract Product createCopy();
}
