package com.gadrawingz.javabase64;
import java.util.Base64;

public class Base64URLEncodingDecoding {
    public static void main(String[] args) {

        // Getting encoder
        Base64.Encoder encoder = Base64.getUrlEncoder();

        // Encoding URL
        String eString = encoder.encodeToString("http://www.donnekt.com".getBytes());
        System.out.println("Encoded URL: "+eString);

        // Getting decoder
        Base64.Decoder decoder = Base64.getUrlDecoder();

        // Decoding URI
        String dString = new String(decoder.decode(eString));
        System.out.println("Decoded URL: "+dString);
    }
}
