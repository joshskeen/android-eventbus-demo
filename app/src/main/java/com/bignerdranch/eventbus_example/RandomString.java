package com.bignerdranch.eventbus_example;

import java.math.BigInteger;
import java.security.SecureRandom;

/**
 * Created by joshskeen on 10/16/14.
 */
public class RandomString {

    public static String makeRandom() {
        return "randomString!!" + new BigInteger(10, new SecureRandom()).toString(32);
    }

}
