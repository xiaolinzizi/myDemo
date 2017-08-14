package com.cn.myself.serviceImpl;

import com.cn.myself.entity.Customer;
import com.cn.myself.entity.Order;
import com.cn.myself.entity.PersonEntity;
import com.cn.myself.service.IHello;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.util.Arrays;
import java.util.List;

/**
 * Created by xiaolin.zhang on 2017/4/12.
 * 远程接口方法实现以及远程对象绑定
 */
public class HelloImpl implements IHello,Serializable{

    @Override
    public String hello() throws RemoteException {
        return "hello";
    }

    @Override
    public String sayHelloTosb(String someone) throws RemoteException {
        return "say hello to:"+someone;
    }

    public static void main(String[] args) {
//        IHello hello=new HelloImpl();
//        try {
//            LocateRegistry.createRegistry(8888);
//            try {
//                Naming.bind("rmi://192.168.30.78:8888/RHello",hello);
//                System.out.printf("远程对象绑定成功");
//            } catch (AlreadyBoundException e) {
//                e.printStackTrace();
//            } catch (MalformedURLException e) {
//                e.printStackTrace();
//            }
//
//        } catch (RemoteException e) {
//            System.out.println("远程对象创建异常");
//            e.printStackTrace();
//        }
        try {
            Class obj=Class.forName("com.cn.myself.entity.Order");
            System.out.println("class"+obj.getClass());
            System.out.println("class Name:"+obj.getName());
            System.out.println("methods"+obj.getDeclaredMethods());
            System.out.println("filds:"+obj.getFields());
            Customer customer=new Customer(20);
            Class c=customer.getClass();
            Field filed=c.getDeclaredField("age");
            filed.setAccessible(true);
            System.out.println(filed.get(customer));
            filed.set(customer,30);
            System.out.println("修改后:"+filed.get(customer));
            PersonEntity[] personEntities=new PersonEntity[100];
//            Object[] ob=(Object[])personEntities;
//            personEntities =(PersonEntity[])ob;
//            Object[] ob=new Object[1000];
//            PersonEntity[] per=(PersonEntity[])ob;
            personEntities=Arrays.copyOf(personEntities,2*personEntities.length);
            System.out.println("扩充后:"+personEntities.length);
            PersonEntity entity=new PersonEntity();
//            entity.setName("zxl");
//            Method methed=entity.getClass().getMethod("getName");
//            System.out.println("methed name："+methed.getName());
//            System.out.println(methed.invoke(entity));

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

