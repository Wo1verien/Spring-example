package com.cz.spring;

import com.cz.spring.annotation.AutowDemo;
import com.cz.spring.aop.Student;
import com.cz.spring.di.constructor.Students;
import com.cz.spring.di.setter.TextEditor;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

/**
 * Created 2019-08-12.
 *
 * @author changzheng
 */
public class MainApp {
    public static void main(String[] args) {

//        BeanFactory factory = new XmlBeanFactory(new ClassPathResource("Beans.xml"));
//        ApplicationContext context =
//                new ClassPathXmlApplicationContext("Beans.xml");
//        HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
//        obj.getMessage();


//        HelloWorld obj1 =new HelloWorld();
//        obj1.setMessage("hello");
//        obj1.getMessage();

//        ApplicationContext context =
//                new ClassPathXmlApplicationContext("Beans.xml");
//        Students stu = (Students) context.getBean("students");
//        stu.stuSaydept();



//        TextEditor te = (TextEditor) context.getBean("textEditor");
//        te.spellCheck();

//        AutowDemo aw =(AutowDemo)context.getBean("autowDemo");
//        aw.say();


        ApplicationContext context =
                new ClassPathXmlApplicationContext("aopAspectJ.xml");
        Student student = (Student)context.getBean("student");
        student.getAge();
        student.getName();
        student.pringThrowException();


    }

}
