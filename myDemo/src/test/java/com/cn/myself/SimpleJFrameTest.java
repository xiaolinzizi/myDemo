package com.cn.myself;

import javax.swing.*;
import java.awt.*;
import java.awt.font.FontRenderContext;
import java.awt.geom.Rectangle2D;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.IllegalFormatWidthException;

/**
 * Created by xiaolin.zhang on 2017/5/1.
 */
public class SimpleJFrameTest {
    //psvm  快捷键
    public static void main(String[] args) {
        String[] fontArrays=GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
        for (String fontName:fontArrays) {
            System.out.printf("本地字体:"+fontName);
        }

        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                SimplateJframe  jframe=new SimplateJframe();
                jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                jframe.setVisible(true);
            }
        });
    }
}
class SimplateJframe extends JFrame{
    private static final  int WIDTH=300;
    private  static final  int HEIGHT=300;

    public SimplateJframe(){
        MyComponent  component=new MyComponent();
        this.add(component);
        Toolkit kit=Toolkit.getDefaultToolkit();
        Dimension dimension=kit.getScreenSize();
        double height=dimension.getHeight();
        double width=dimension.getWidth();
        setSize((int)width/2,(int)height/2);
    }
}
class MyComponent extends JComponent{
    private static  final int X=75;
    private static  final int Y=100;
    private static  final int WIDTH=300;

    public MyComponent() {
        this.setBackground(SystemColor.RED);
    }

    private static  final int HEIGHT=200;

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D graphics2D =(Graphics2D)g;
        Rectangle2D.Double rect=new Rectangle2D.Double(0,0,100,100);
        //graphics2D.setBackground(Color.BLUE);
        graphics2D.setPaint(new Color(0,128,128));
        graphics2D.fill(rect);
        //画字体
        Font sanFont=new Font("Sanserifs",Font.BOLD,14);
        FontRenderContext content=graphics2D.getFontRenderContext();
        Rectangle2D     rects=sanFont.getStringBounds("hello,zxl",content);
        graphics2D.drawString("hello.zxl",200,200);
        try {
            //绘制图像
            ImageIcon icon=new ImageIcon(new URL("http://m.elongstatic.com/promotions/banner/background.png"),"image");
            Image image=icon.getImage();
            graphics2D.drawImage(image,30,30,200,200,null);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
//        graphics2D.drawString("hello.zxl",200,200);
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(WIDTH,HEIGHT);
    }
}
