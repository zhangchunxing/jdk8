package com.shengsiyuan.jdk8;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by 85239 on 2017/1/14.
 */
public class SwingTest {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("My Frame");
        JButton jButotn = new JButton("My Button");
        jButotn.addActionListener(e -> {System.out.println("Button pressed!");});

        jFrame.add(jButotn);
        jFrame.pack();
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
