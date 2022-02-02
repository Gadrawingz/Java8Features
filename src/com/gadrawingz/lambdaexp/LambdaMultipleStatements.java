package com.gadrawingz.lambdaexp;
interface Chatroom {
    String sendMessage(String message);
}

public class LambdaMultipleStatements {
    public static void main(String[] args) {

        // U can pass multiple statements in lambda expression
        Chatroom chatroom1 = (message) -> {
            String text1 = "I\'d like to say, ";
            String fullText = text1 + message;
            return fullText;
        };
        System.out.println(chatroom1.sendMessage("Congratulations!"));


        Chatroom chatroom2 = (message) -> {
            String intro = "Good morning, ";
            String outro = "Good bye!";
            String fullText = "\n"+intro+"\n"+message+"\n"+outro;
            return fullText;
        };
        System.out.println(chatroom2.sendMessage("I am here to say..."));

    }
}