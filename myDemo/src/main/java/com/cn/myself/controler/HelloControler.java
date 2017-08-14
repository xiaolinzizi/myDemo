package com.cn.myself.controler;

import org.apache.ibatis.reflection.SystemMetaObject;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.web.csrf.CsrfFilter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Created by xiaolin.zhang on 2017/3/5.
 */
@Controller
public class HelloControler {

    @RequestMapping(value = {"/","/welcome/"},method = RequestMethod.GET)
    public ModelAndView welcome(HttpServletRequest request){
        ModelAndView model=new ModelAndView();
        HttpSession     session=request.getSession();

        if (session != null) {
            System.out.printf(session.getAttributeNames().toString());
            model.addObject("attributeNames", session.getAttributeNames().toString());
        }
        if (session != null && session.getAttribute("username")!=null) {
            model.addObject("username", session.getAttribute("username"));
        }
        if (session != null && session.getAttribute("password")!=null) {
            model.addObject("password",session.getAttribute("password"));
        }
        model.setViewName("welcome");
        model.addObject("title","welcome");
        model.addObject("message","welcome");
        return model;
    }
    @RequestMapping(value = {"/admin/**"},method = RequestMethod.GET)
    public ModelAndView admin( HttpServletRequest request){
        ModelAndView model=new ModelAndView();
        HttpSession session=request.getSession();

        if (session.getId()!=null){
            model.addObject("sessionId",session.getId());
        }
        model.setViewName("admin");
        model.addObject("title","admin");
        model.addObject("message","admin");
        return model;
    }
    @RequestMapping(value = {"/dba/*"},method = RequestMethod.GET)
    public ModelAndView daba(){
        ModelAndView model=new ModelAndView();
        model.setViewName("admin");
        model.addObject("title","dba");
        model.addObject("message","dba");
        return model;
    }
    //key SPRING_SECURITY_LAST_EXCEPTION
    @RequestMapping(value = "/loginpagetodo")
    public String login(@RequestParam(value = "error",required = false)String error,
                        @RequestParam(value = "out",required = false) String out,
                        HttpServletRequest request){
        HttpSession session=request.getSession();
         ModelAndView model =new ModelAndView();

        if (session != null  && session.getAttribute("SPRING_SECURITY_LAST_EXCEPTION")!=null) {
            System.out.println("登录失败:"+session.getAttribute("SPRING_SECURITY_LAST_EXCEPTION"));
            model.addObject("exceptionMsg",(session.getAttribute("SPRING_SECURITY_LAST_EXCEPTION")));
        }
        if(out!=null){
            model.addObject("logout","退出登录页");
            return "admin";
        }
        if (error != null) {
            model.addObject("error","登录失败");
            return "loginfail";
        }

//        if(error==null ||  out==null){
//            model.addObject("loginsuccess","登录成功");
//            return "loginsuccess";
//        }
         return "login";
    }
    @RequestMapping(value="/login")
    public String login(){
      return "login";
    }
}
