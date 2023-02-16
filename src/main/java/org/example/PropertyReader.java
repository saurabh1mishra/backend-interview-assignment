package org.example;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader {

    private Properties properties;
    private static PropertyReader propertyReader;

    private PropertyReader() throws IOException {
        String envName = System.getProperty("ENV", "env");
        this.properties = new Properties();
        this.properties.load(new FileInputStream(String.format("src/main/resources/%s.properties", envName)));
    }


    public static PropertyReader getInstance()  {
        if (propertyReader == null) {
            try {
                propertyReader = new PropertyReader();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return propertyReader;
    }

    public String getHost() {
        return (String) properties.get("host");
    }

}
