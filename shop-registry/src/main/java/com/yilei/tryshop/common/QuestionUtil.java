package com.yilei.tryshop.common;

import java.util.Base64;

public class QuestionUtil {

    public static void main(String[] args) {
        Base64.Encoder encoder = Base64.getEncoder();
        byte[] encode = encoder.encode("SecretKey012345678901234567890123456789012345678901234567890123456789".getBytes());
        System.out.println(new String(encode));
    }

}
