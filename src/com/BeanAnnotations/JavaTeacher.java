package com.BeanAnnotations;

import org.springframework.stereotype.Component;

@Component
public class JavaTeacher implements Faculty {
    @Override
    public void teach() {
        System.out.println("Starting :: java Class by Kalyan");
    }
}
