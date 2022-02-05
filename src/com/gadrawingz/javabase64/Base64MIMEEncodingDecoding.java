package com.gadrawingz.javabase64;

import java.util.Base64;

public class Base64MIMEEncodingDecoding {
    public static void main(String[] args) {

        // Getting MIME encoder
        Base64.Encoder encoder = Base64.getMimeEncoder();
        String message = "Hello, \nYou are informed regarding \nYour inconsistency of work";

        String eString = encoder.encodeToString(message.getBytes());
        System.out.println("Original message: "+message+"\n");
        System.out.println("Encoded MIME message: "+eString);

        // Getting MIME decoder
        Base64.Decoder decoder = Base64.getMimeDecoder();

        // Decoding MIME encoded message
        String dString = new String(decoder.decode(eString));
        System.out.println("\nDecoded message: "+dString);
    }
}
