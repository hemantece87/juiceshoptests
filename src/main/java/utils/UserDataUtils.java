package utils;

import java.util.Random;

public class UserDataUtils {

    public static String getUserEmail() {
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(1000);
        return "username" + randomInt + "@gmail.com";
    }
}
