package com.example.design_pattern.ch2_adapter.q2;// FileProperties 클래스를 구현해 보세요.

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.util.Properties;

public class FileProperties implements FileIO {

    Properties properties = new Properties();

    public void readFromFile(String filename) throws IOException {
      Reader reader = new FileReader(filename);
      properties.load(reader);
    }

    public void writeToFile(String filename) throws IOException {
        // properties의 내용을 파일에 저장한다.
      properties.store(new FileWriter(filename), "written by FileProperties");
    }

    public void setValue(String key, String value) {
        // properties에 key와 value를 설정한다.
      properties.setProperty(key, value);
    }

    public String getValue(String key) {
        // properties에서 key에 해당하는 값을 얻는다.
      return properties.getProperty(key);
    }
}
