package com.example.design_pattern.ch4_factory_method.sample.idcard;


import com.example.design_pattern.ch4_factory_method.sample.framework.Factory;
import com.example.design_pattern.ch4_factory_method.sample.framework.Product;

public class IDCardFactory extends Factory {
    @Override
    protected Product createProduct(String owner) {
        return new IDCard(owner);
    }

    @Override
    protected void registerProduct(Product product) {
        System.out.println(product + "을 등록했습니다.");
    }
}
