package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    public static void main(String[] args) {
        String configLocation="spring.xml";
    ApplicationContext applicationContext = new ClassPathXmlApplicationContext(configLocation);
    Student s= (Student) applicationContext.getBean("S");
        System.out.println(s);
    }
}
