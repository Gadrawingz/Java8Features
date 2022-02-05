package com.gadrawingz.javabase64;

import java.util.Base64;

public class Base64BasicEncryptionExa1 {
    public static void main(String[] args) {

        // Getting encoder
        Base64.Encoder encoder = Base64.getEncoder();

        // Creating byte array
        byte byteArray[] = {1,2};

        // Encoding byte array
        byte byteArray2[] = encoder.encode(byteArray);
        System.out.println("Encoded byteArray2: "+byteArray2);

        byte byteArray3[] = new byte[5];
        int x = encoder.encode(byteArray, byteArray3); // Returns number of bytes written
        System.out.println("Encoded byte array written to another array: "+byteArray3);
        System.out.println("Number of bytes written: "+x);

        // Encoding string
        String str = encoder.encodeToString("Gadrawingz".getBytes());
        System.out.println("Encoded string: "+str);

        // Getting decoder
        Base64.Decoder decoder = Base64.getDecoder();

        // Decoding string
        String dStr = new String(decoder.decode(str));
        System.out.println("Decoded string: "+dStr);
    }
}
