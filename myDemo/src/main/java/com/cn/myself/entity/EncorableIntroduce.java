package com.cn.myself.entity;

import com.cn.myself.service.Encorable;
import com.cn.myself.serviceImpl.DefaultEncorableImpl;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;

/**
 * Created by xiaolin.zhang on 2017/2/23.
 */
//@Aspect
public class EncorableIntroduce {

//    @DeclareParents(value = "com.cn.myself.service.IPermanceService+",
//            defaultImpl = DefaultEncorableImpl.class )
    public static Encorable encorable;
}
