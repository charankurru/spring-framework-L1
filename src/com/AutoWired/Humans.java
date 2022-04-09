package com.AutoWired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Humans implements  Organisms {
    private Organ org;

    Humans()
    {
        System.out.println("Constructor :: Initialized");
    }

    @Autowired()
    @Qualifier("org")
    public void setOrg(Organ obj)
    {
        System.out.println("Setter Method ::  Initialized");
        this.org = obj;
    }

    @Override
    public void show_props() {
        org.organ_details();
    }
}
