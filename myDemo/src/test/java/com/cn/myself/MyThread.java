package com.cn.myself;

/**
 * Created by xiaolin.zhang on 2017/6/11.
 */
public class MyThread extends  Thread{
    private static int a=5;
    @Override
    public void run() {
        a--;
        System.out.printf("a:"+a);
    }
}
