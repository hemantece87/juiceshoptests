package utils;

import java.io.FileInputStream;
import java.util.Objects;
import java.util.Properties;

public class ReadPropertyFile {

    private ReadPropertyFile()
    {}

    public static String getProperty(String key) throws Exception {
        String value = "";
        Properties property = new Properties();
        FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"/config.properties");
        property.load(file);
        value=property.getProperty(key);
        if (Objects.isNull(value)){
            throw new Exception("Property name key"+key+"not found in config.properties");
        }
        return value;
    }

}
