package com.cn.myself.serviceImpl;

import com.cn.myself.service.Encorable;
import org.springframework.stereotype.Service;

/**
 * Created by xiaolin.zhang on 2017/2/23.
 */
@Service
public class DefaultEncorableImpl implements Encorable{
    public void performeEncor() {
        System.out.println("default performeEncor");
    }
}
