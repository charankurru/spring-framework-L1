package com.BeanAnnotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("coll")
public class College {
    @Autowired // dependency injection of object type
    private  Principal principal;

    @Autowired // dependency injection of object type
    @Qualifier("javaTeacher")
    private  Faculty faculty;

    @Value("${college.collegeName}") //dependency injection of Literal type
    private String college;

    public void test()
    {
        System.out.println("Starting Up ! :: college ");
        System.out.println("College name is "+college);
        this.principal.principal_details();
        this.faculty.teach();
    }
}
