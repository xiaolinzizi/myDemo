package com.cn.myself.controler;

import com.cn.myself.entity.PersonEntity;
import com.cn.myself.service.IPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by xiaolin.zhang on 2017/2/22.
 */

@Controller
@RequestMapping(value="personcontroler")
public class PersonControler {
    @Autowired
    private IPersonService personServiceImpl;

    @ResponseBody
    @RequestMapping(value="addperson",method = RequestMethod.POST, consumes = "application/json")
    public boolean addPerson(@RequestBody PersonEntity personEntity) throws  Exception{
       // System.out.printf("test");
        return personServiceImpl.addPerson(personEntity);
    }
    @ResponseBody
    @RequestMapping(value = "getpersonbyid" ,method = RequestMethod.GET)
    public  PersonEntity getPersonEntity(int id){
        PersonEntity personEntity=null;
        try {
            personEntity=personServiceImpl.getPersonById(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return personEntity;
    }
}
