package com.cn.myself.controler;

import com.cn.myself.service.IHello;
import com.cn.myself.serviceImpl.HelloImpl;
import com.sun.xml.internal.rngom.xml.util.Naming;

import java.net.MalformedURLException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

/**
 * Created by xiaolin.zhang on 2017/4/12.
 */
public class HelloClient {
    public static void main(String[] args) {
        try {
            IHello hello=(IHello) java.rmi.Naming.lookup("rmi://192.168.30.78:8888/RHello");
            System.out.println(hello.hello());
            System.out.println(hello.sayHelloTosb("zxl"));
        } catch (NotBoundException e) {
			
			
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        }

    }
}
