package com.example.design_pattern.ch8_abstract_factory.Sample.listfactory;


import com.example.design_pattern.ch8_abstract_factory.Sample.factory.Link;

public class ListLink extends Link {
    public ListLink(String caption, String url) {
        super(caption, url);
    }

    @Override
    public String makeHTML() {
        return "  <li><a href=\"" + url + "\">" + caption + "</a></li>\n";
    }
}
