package com.example.design_pattern.ch14_chain_of_responsibility.Sample;

public class SpecialSupport extends Support {
    private int number; // 이 번호만 해결할 수 있다

    public SpecialSupport(String name, int number) {
        super(name);
        this.number = number;
    }

    @Override
    protected boolean resolve(Trouble trouble) {
        if (trouble.getNumber() == number) {
            return true;
        } else {
            return false;
        }
    }
}