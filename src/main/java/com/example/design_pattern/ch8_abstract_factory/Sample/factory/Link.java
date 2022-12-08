package com.example.design_pattern.ch8_abstract_factory.Sample.factory;

public abstract class Link extends Item {
    protected String url;

    public Link(String caption, String url) {
        super(caption);
        this.url = url;
    }
}
