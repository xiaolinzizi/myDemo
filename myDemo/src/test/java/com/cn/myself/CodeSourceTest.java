package com.cn.myself;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

/**
 * Created by xiaolin.zhang on 2017/8/7.
 */
public class CodeSourceTest {
    public static void main(String[] args) {
        //队列源代码
        BlockingQueue queue=new ArrayBlockingQueue(5);
        queue.add("1");
        queue.add("2");
        queue.add("3");
        queue.add("4");
        queue.add("5");
        //System.out.println("get:"+queue.poll());
        queue.offer("6");
        //双端队列
        Deque deque=new LinkedBlockingDeque();
//        deque.addFirst("a");
//        deque.addFirst("b");
//        deque.addFirst("d");
//        deque.addLast("c");
        System.out.printf("deque:"+deque.t);
    }

}
