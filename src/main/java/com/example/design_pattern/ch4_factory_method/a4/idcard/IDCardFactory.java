package com.example.design_pattern.ch4_factory_method.a4.idcard;

import com.example.design_pattern.ch4_factory_method.a4.framework.Factory;
import com.example.design_pattern.ch4_factory_method.a4.framework.Product;
public class IDCardFactory extends Factory {
    private int serial = 100;

    protected synchronized Product createProduct(String owner) {
        return new IDCard(owner, serial++);
    }

    @Override
    protected void registerProduct(Product product) {
        System.out.println(product + "을 등록했습니다.");
    }
}
