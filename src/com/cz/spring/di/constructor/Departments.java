package com.cz.spring.di.constructor;

/**
 * Created 2019-08-12.
 *
 * @author changzheng
 */
public class Departments {
    public Departments() {
        System.out.println("dept构造函数");
    }

    public void sayDept(){
        System.out.println("dept");
    }
}
