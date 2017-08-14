package com.cn.myself;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by xiaolin.zhang on 2017/5/2.
 * 事件监听与处理
 */
public class ColorChnageed implements ActionListener{
    private Color nowColor;

    public ColorChnageed(Color nowColor) {
        this.nowColor = nowColor;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
