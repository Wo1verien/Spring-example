package com.cz.spring.hello;

/**
 * Created 2019-08-12.
 *
 * @author changzheng
 */
public class HelloWorld {
    private String message;
    public void setMessage(String message){
        this.message  = message;
    }
    public void getMessage(){
        System.out.println("Your Message : " + message);
    }
}
