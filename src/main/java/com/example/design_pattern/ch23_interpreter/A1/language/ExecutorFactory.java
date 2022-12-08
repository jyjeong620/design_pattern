package com.example.design_pattern.ch23_interpreter.A1.language;

public interface ExecutorFactory {
    public abstract Executor createExecutor(String name);
}
