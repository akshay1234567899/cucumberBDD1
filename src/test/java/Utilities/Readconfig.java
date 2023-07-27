package Utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class Readconfig {
    public static Properties properties;
    public static String path = "/Users/akshaydhiman/IdeaProjects/cucumber_001/src/test/java/Configration/Config.properties";
   //constructor of class
    public  Readconfig() {
        properties= new Properties();

        try (FileInputStream fs = new FileInputStream((path))) {
            properties.load(fs);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public String getBrowser(){
        String value = properties.getProperty("browser");
        if (value != null) {
         return value;
        } else {
            throw new RuntimeException("url not specified in config file");
        }
    }
}
