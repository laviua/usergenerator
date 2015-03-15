package ua.com.lavi.usergenerator.utils;

import org.apache.commons.lang3.RandomStringUtils;

/**
 * Created by lavi on 15.03.2015.
 */
public class PasswordGenerator {

    private static int DEFAULT_PASSSWORD_LENGTH = 8;

    public static String generatePassword() {
        return RandomStringUtils.randomAlphanumeric(DEFAULT_PASSSWORD_LENGTH);
    }
}
