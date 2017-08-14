package com.cn.myself;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by xiaolin.zhang on 2017/5/2.
 * 事件处理
 */
public class TestJPanel {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                Myframe myframe=new Myframe("myframe");
                myframe.setVisible(true);
                myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            }
        });
    }
}
class Myframe extends JFrame{
    private JPanel panel;
    private static final  int WIDTH=300;
    private  static final  int HEIGHT=300;

    public Myframe(String title) throws HeadlessException {
        this.setSize(WIDTH,HEIGHT);
        JButton jButton=new JButton("按钮一");
        ColorChnageed colorChnageed=new ColorChnageed(Color.BLACK);
        jButton.addActionListener(colorChnageed);
        panel=new JPanel();
        panel.add(jButton);
        this.add(panel);
    }
    private class ColorChnageed implements ActionListener{
        private Color nowColor;

        public ColorChnageed(Color nowColor) {
            this.nowColor = nowColor;
        }
        @Override
        public void actionPerformed(ActionEvent e) {
            panel.setBackground(nowColor);
        }
    }
}
