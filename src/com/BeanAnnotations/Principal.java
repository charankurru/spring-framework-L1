package com.BeanAnnotations;

import org.springframework.stereotype.Component;

@Component("principal")
public class Principal {

    public void principal_details()
    {
        System.out.println("Principal name is: Charan");
        System.out.println("Age is 25");
    }

}
