package com.cz.spring.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;

import javax.annotation.Resource;

/**
 * Created 2019-08-13.
 *
 * @author changzheng
 */
public class AutowDemo {

    //@Autowired
    //@Resource
    private AutowDemo1 autowDemo1;

    //@Autowired
    public AutowDemo(AutowDemo1 autowDemo1){
        System.out.println("Inside AutowDemo constructor." );
        this.autowDemo1=autowDemo1;
    }

    public AutowDemo() {

    }

    public void say(){
        autowDemo1.say1();
    }

    //@Autowired
    @Resource
    public void setAutowDemo1(AutowDemo1 autowDemo1){
        this.autowDemo1=autowDemo1;
    }
}
