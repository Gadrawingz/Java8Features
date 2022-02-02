package com.gadrawingz;

import javax.swing.*;

public class LambdaXEventListener {
    public static void main(String[] args) {

        JTextField textField = new JTextField();
        textField.setBounds(50, 50, 150, 20);

        JButton jButton = new JButton("Click");
        jButton.setBounds(50, 80, 80, 30);

        // Lambda expression implementing...
        jButton.addActionListener(e -> {textField.setText("Hello Swing!");});

        JFrame frame = new JFrame();
        frame.add(textField);
        frame.add(jButton);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}
