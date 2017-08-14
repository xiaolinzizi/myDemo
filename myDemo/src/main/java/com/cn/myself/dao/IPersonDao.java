package com.cn.myself.dao;
import com.cn.myself.entity.PersonEntity;
import org.apache.ibatis.annotations.Param;
import org.springframework.jdbc.core.simple.SimpleJdbcDaoSupport;

/**
 * Created by xiaolin.zhang on 2017/2/21.
 */
public interface IPersonDao {

        public boolean addPerson(@Param(value="person") PersonEntity person) throws  Exception;
        public PersonEntity getPersonById(int id) throws  Exception;

}
