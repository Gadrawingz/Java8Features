package com.gadrawingz.methodref;

interface Messageable {
    Message getMessage(String message);
}

// This class contains constructor
class Message {
    Message(String message) {
        System.out.println(message);
    }
}

public class RefToConstructor {
    public static void main(String[] args) {

        Messageable hello = Message::new;
        hello.getMessage("Hello Java world");
    }
}