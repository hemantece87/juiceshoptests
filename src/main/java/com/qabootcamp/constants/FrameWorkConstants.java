package com.qabootcamp.constants;

public class FrameWorkConstants {

    public static final String CHROME_DRIVER_PATH = System.getProperty("user.dir")+"/src/test/resources/chromedriver";

    public static String getChromeDriverPath() {
        return CHROME_DRIVER_PATH;
    }
}
