package com.JDBC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JdbcExample {
    public static  void main(String[] args)
    {
        ApplicationContext ac =  new ClassPathXmlApplicationContext("Beans.xml");
        JdbcConnection obj  = ac.getBean("jdbc",JdbcConnection.class);
//        obj.show_details();
        obj.make_connection();
//        obj.createTable();
//        obj.InsertData();
        obj.displayRecords();
    }
}
