package com.cn.myself;

import javax.swing.*;
import java.awt.*;

/**
 * Created by xiaolin.zhang on 2017/5/5.
 */
public class JTextFieldtest {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame  jframe=new JFrame();
                jframe.setSize(200,200);
                JPanel jpanel=new JPanel();
                JTextField field=new JTextField("zxlzxl",20);
                JTextArea textArea=new JTextArea("textarea",5,5);
                //将组件放入到滚动窗格
                JScrollPane srollPane=new JScrollPane(textArea);
                field.setColumns(10);
                field.setText("hello,hello  ");
                JLabel label=new JLabel("test test");
                JPasswordField passwordField=new JPasswordField("password");
                ButtonGroup buttonGroup=new ButtonGroup();
                JRadioButton radioButton1=new JRadioButton("111",true);
                JRadioButton radioButton2=new JRadioButton("222");
                buttonGroup.add(radioButton1);
                buttonGroup.add(radioButton2);
                jpanel.revalidate();
                jpanel.add(field);
                jpanel.add(label);
                jpanel.add(srollPane);
                jpanel.add(passwordField);
                //jpanel.setComponentPopupMenu();
                jframe.add(jpanel);
                jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                jframe.setVisible(true);
                System.out.println(field.getText().trim());
            }
        });

    }
}
