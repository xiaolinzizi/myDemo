package com.cn.myself.service;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created by xiaolin.zhang on 2017/4/11.
 * 定义一个远程接口
 */
public interface IHello extends Remote {
    public  String hello() throws RemoteException;
    public String sayHelloTosb(String someone) throws RemoteException;
}
