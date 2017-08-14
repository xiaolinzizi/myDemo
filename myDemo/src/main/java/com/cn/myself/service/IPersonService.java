package com.cn.myself.service;

import com.cn.myself.entity.PersonEntity;

/**
 * Created by xiaolin.zhang on 2017/2/21.
 */
public interface IPersonService {
    /**
     * Created by xiaolin.zhang on 2017/2/21.
     */
        public boolean addPerson(PersonEntity person) throws  Exception;
        public PersonEntity getPersonById(int id) throws  Exception;

}
