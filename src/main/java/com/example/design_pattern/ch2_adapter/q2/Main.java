package com.example.design_pattern.ch2_adapter.q2;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        FileIO f = new FileProperties();
        String path = System.getProperty("user.dir") + "/src/main/java/com/example/design_pattern/ch2_adapter/q2/";
        System.out.println("1111 : " + path);
        try {
            f.readFromFile(path + "file.txt");
            f.setValue("width", "1024");
            f.setValue("height", "512");
            f.setValue("depth", "32");
            f.writeToFile(path + "newfile.txt");
            System.out.println("newfile.txt is created.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
