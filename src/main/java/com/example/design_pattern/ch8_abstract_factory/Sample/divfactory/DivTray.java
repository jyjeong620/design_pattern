package com.example.design_pattern.ch8_abstract_factory.Sample.divfactory;

import com.example.design_pattern.ch8_abstract_factory.Sample.factory.Item;
import com.example.design_pattern.ch8_abstract_factory.Sample.factory.Tray;

public class DivTray extends Tray {
    public DivTray(String caption) {
        super(caption);
    }

    @Override
    public String makeHTML() {
        StringBuilder sb = new StringBuilder();
        sb.append("<p><b>");
        sb.append(caption);
        sb.append("</b></p>\n");
        sb.append("<div class=\"TRAY\">");
        for (Item item: tray) {
            sb.append(item.makeHTML());
        }
        sb.append("</div>\n");
        return sb.toString();
    }
}
