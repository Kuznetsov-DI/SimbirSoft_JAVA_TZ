package config;

import java.io.IOException;

public class Config {

    public static void setProperties(){

        try {
            System.getProperties().load(ClassLoader.getSystemResourceAsStream("application.properties"));
        } catch (
                IOException e) {
            e.printStackTrace();
        }
    }
}