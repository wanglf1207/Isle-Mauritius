package com.isle.mauritius.md5;

import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * @author anthony
 */
public class MD5Utils {

    /**
     * get the md5 summary
     * @param str
     * @return
     */
    public static String getMD5Summary(String str) {

        StringBuffer stringBuffer = new StringBuffer();
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            byte[] bs = messageDigest.digest(str.getBytes(Charset.forName("UTF-8"))) ;

            for (int i = 0; i < bs.length; i++) {
                int c = bs[i] & 0xFF ;
                if(c < 16){
                    stringBuffer.append("0");
                }
                stringBuffer.append(Integer.toHexString(c)) ;
            }
            return stringBuffer.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return stringBuffer.toString();
    }
}
