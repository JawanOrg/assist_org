package com.free.assist.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5 {
    public static String encode(String str) {
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException("需加密的字符串不能为空！");
        }

        StringBuffer sb = new StringBuffer();

        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(str.getBytes());
            byte[] hash = md.digest();

            for (int i = 0; i < hash.length; i++) {
                if ((0xff & hash[i]) < 0x10) {
                    sb.append("0" + Integer.toHexString((0xFF & hash[i])));
                } else {
                    sb.append(Integer.toHexString(0xFF & hash[i]));
                }
            }
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }

        return sb.toString();
    }
}
