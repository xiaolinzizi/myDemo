package com.cn.myself;

import java.util.*;

/**
 * Created by xiaolin.zhang on 2017/6/5.
 */
public enum EnumeTest {
    MONDEY,TUESDAY,THIRDAY;

    public static void main(String[] args) {
        EnumSet<EnumeTest> enumeTests=EnumSet.allOf(EnumeTest.class);
//        for (EnumeTest enums:enumeTests) {
//            System.out.printf("enum:"+enums);
//        }
        List<String> list1=new ArrayList<>();
        List list2;
        list2=list1;
        Collections.checkedList(list1,String.class);
        list2.add(new Date());
        //System.out.printf("size:"+list2.size());

        List collections=Collections.nCopies(100,"123");
        //不可变
       // Set set=Collections.singleton(collections);
        //set.add("124");
        String[] strArray={"aaa","bbb","ccc"};
        Set set=new HashSet(Arrays.asList(strArray));
        Collections.shuffle(Arrays.asList(strArray));
        for (String str: strArray) {
           // System.out.printf("str:"+str);
        }
        //1
       String[] str2=(String[]) set.toArray(new String[3]);
       // System.out.printf("str2:"+str2.length);

        //查找元素不同算法
         Integer[] binary={1,2,3,4,5,6,7,8};
         List<Integer> listBinary=Arrays.asList(binary);
         int low=0;
         int high=listBinary.size()-1;
        int middle=0;//标识中间位置
        int   middleNum=0;
        int needSearvchNum=6;
//         while(low<high){
//             middle=(low+high)>>>1;
//             middleNum=listBinary.get(middle);
//            if(needSearvchNum<middleNum){
//                high=middle-1;
//            }else if(needSearvchNum>middleNum){
//                low=middle+1;
//            }else{
//                System.out.printf("middle:"+middle);
//                return ;
//            }
//         }
      //  System.out.printf("low:"+low+";high:"+high+"搜索元素所在的索引:"+listBinary.indexOf(needSearvchNum));
        Thread t1=new MyThread();
        Thread t2=new MyThread();
            t1.start();
            t2.start();


    }

}
