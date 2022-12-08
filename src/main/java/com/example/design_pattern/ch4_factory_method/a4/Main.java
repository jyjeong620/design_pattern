package com.example.design_pattern.ch4_factory_method.a4;


import com.example.design_pattern.ch4_factory_method.a4.framework.Factory;
import com.example.design_pattern.ch4_factory_method.a4.framework.Product;
import com.example.design_pattern.ch4_factory_method.a4.idcard.IDCardFactory;

public class Main {
    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        Product card1 = factory.create("Youngjin Kim");
        Product card2 = factory.create("Heungmin Son");
        Product card3 = factory.create("Kane");
        card1.use();
        card2.use();
        card3.use();
    }
}
