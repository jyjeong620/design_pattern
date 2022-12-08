package com.example.design_pattern.ch15_facade.Sample;


import com.example.design_pattern.ch15_facade.Sample.pagemaker.PageMaker;

public class Main {
    public static void main(String[] args) {
        PageMaker.makeWelcomePage("hyuki@example.com", "welcome.html");
    }
}
