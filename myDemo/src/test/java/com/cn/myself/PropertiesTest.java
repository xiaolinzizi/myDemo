package com.cn.myself;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.*;
import java.util.logging.Logger;
import java.util.prefs.Preferences;

/**
 * Created by xiaolin.zhang on 2017/5/14.
 */
public class PropertiesTest {

    public static <T extends ColorAction>  T[]  min(T[] a){
        if (a != null) {

        }
        return a;
    }
    public static  <T extends  Comparable>  T color(){
        return null;
    }

    private static <T> T getMiddle(){
        return null;
    }
    public static void main(String[] args) throws  Exception {
//        Properties properties=new Properties();
//        int x=3;
//        Logger.getGlobal().info("Logger start");
//        assert  x>=0;
////        properties.setProperty("aa","111");
////        properties.setProperty("bb","222");
////        properties.store(new FileOutputStream(new File("D:\\properties.properties")),"properties");
//        properties.load(new FileInputStream(new File("D:\\properties.properties")));
//        System.out.printf(properties.getProperty("aa"));
//        System.out.printf(System.getProperty("user.home"));;
//        System.out.printf(System.getProperty("java.version"));
//        System.out.printf(Preferences.userRoot().toString());
        /**
        try(){
            //退出
        } */
        JSlider js=new JSlider();

        Dictionary<Integer,Component> dictionary=js.getLabelTable();
       // ColorAction<T>[] co=new ColorAction<T>[10];
        LinkedList list=new LinkedList();
        list.add(0,"aaa");
        list.add(1,"bbb");
        list.add(2,"ccc");
        //System.out.printf("size:"+list.size());
        ListIterator it1=list.listIterator();
        ListIterator it2=list.listIterator();
        System.out.println(""+list.get(2));
        Map map=new LinkedHashMap();
        map.put(1,"zxl");
        map.put(2,"aaaa");
        map.put(3,"xcxcxc");
        map.put(4,"wwrfedg");
        Iterator iterator=map.values().iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        HashSet set=new HashSet();
    }
}
