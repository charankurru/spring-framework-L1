package com.BeanAnnotations;

import org.springframework.stereotype.Component;

@Component
public class MathTeacher implements  Faculty{
    @Override
    public void teach() {
        System.out.println("Starting :: Math Class by Raja");
    }
}
