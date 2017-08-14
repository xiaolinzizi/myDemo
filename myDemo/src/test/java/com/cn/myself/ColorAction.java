package com.cn.myself;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by xiaolin.zhang on 2017/5/4.
 */
public class ColorAction extends AbstractAction{
    private static  final JPanel panel=new JPanel();

    public ColorAction(String name, Icon icon, Color color){

        putValue(Action.NAME,name);
        putValue(Action.SMALL_ICON,icon);
        putValue("color",color);
        putValue(Action.SHORT_DESCRIPTION,"little"+name.toLowerCase());
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        //System.out.printf(""+(Color)getValue("color"));
        //System.out.printf("panel："+this.panel);
        this.panel.setBackground((Color)getValue("color"));
    }

    public static void main(String[] args) {
        try {
            Action action=new ColorAction("colorAction",
                  new ImageIcon(new URL("http://m.elongstatic.com/wireless/html/2016/11/150000046/img/mk_bg.png")),
                         Color.RED );
            JFrame frame=new JFrame();
            frame.setSize(300,300);
            JButton button=new JButton(action);
            panel.add(button);
            frame.add(panel);
            frame.setVisible(true);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

    }
}
