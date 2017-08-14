package com.cn.myself.serviceImpl;

import com.cn.myself.dao.IPersonDao;
import com.cn.myself.entity.PersonEntity;
import com.cn.myself.service.IPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.simple.ParameterizedRowMapper;
import org.springframework.jdbc.core.simple.SimpleJdbcDaoSupport;
import org.springframework.jdbc.core.simple.SimpleJdbcTemplate;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by xiaolin.zhang on 2017/2/21.
 * Idea 实现方法:alt+ctrl+p
 */
@Service
public class PersonServiceImpl  implements IPersonService,Serializable {

    @Autowired
    private IPersonDao personDao;
    @Autowired
    private SimpleJdbcTemplate jdbcTemplate;

    public boolean addPerson(PersonEntity person) throws Exception {
        String sql="INSERT INTO `t_person`(id,name) VALUES(?,?)";
        int result=0;
        //int result=getSimpleJdbcTemplate().update(sql,person.getId(),person.getName());
//        int result=jdbcTemplate.update(sql,person.getId(),person.getName());
        return result>0;
       // return personDao.addPerson(person);
    }

    public PersonEntity getPersonById(int id) throws Exception {
        String sql="select *  from t_person where id="+id;
        return null;
//        return jdbcTemplate.queryForObject(sql, new ParameterizedRowMapper<PersonEntity>() {
//            public PersonEntity mapRow(ResultSet rs, int rowNum) throws SQLException {
//                PersonEntity personEntity=new PersonEntity();
//                personEntity.setId(rs.getInt(1));
//                personEntity.setName(rs.getString("name"));
//                return personEntity;
//            }
//        });
        //return personDao.getPersonById(id);
    }
}
