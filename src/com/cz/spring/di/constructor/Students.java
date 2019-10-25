package com.cz.spring.di.constructor;

/**
 * Created 2019-08-12.
 *
 * @author changzheng
 */
public class Students {
    private Departments dept;

    public Students(Departments dept) {
        System.out.println("stu有参构造函数");
        this.dept = dept;
    }

    public void stuSaydept(){
        dept.sayDept();
    }

}
