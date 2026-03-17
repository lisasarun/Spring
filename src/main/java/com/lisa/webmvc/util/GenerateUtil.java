package com.lisa.webmvc.util;

import java.util.concurrent.ThreadLocalRandom;

public class GenerateUtil {

    public static String generateProductCode() {

        int randomNumber= ThreadLocalRandom.current().nextInt(100000);
        return String.format("%s-%05d", "ISTADP", randomNumber);
    }

}
