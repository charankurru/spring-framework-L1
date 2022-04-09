package com.AutoWired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LivingCreatures {
    public static void main(String[] args)
    {
        ApplicationContext ac = new ClassPathXmlApplicationContext("Beans.xml");
        Humans hobj = ac.getBean("hum1",Humans.class);
        hobj.show_props();
    }
}
