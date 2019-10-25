package com.cz.spring.aop;

/**
 * Created 2019-08-13.
 *
 * @author changzheng
 */
public class Logging {

    public void beforeAdvice(){
        System.out.println("Going to setup student profile.");
    }

    public void afterAdvice(){
        System.out.println("Student profile has been setup.");
    }

    public void afterReturningAdvice(Object retVal){
        System.out.println("Return:"+retVal.toString());
    }

    public void afterThrowingAdvice(IllegalArgumentException ex){
        System.out.println("There has been an exception: " + ex.toString());
    }
}
