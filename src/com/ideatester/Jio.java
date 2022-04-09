package com.ideatester;

import java.nio.channels.NetworkChannel;

public class Jio implements  Sim {
    private String Ceo;
    private int NetworkId;
    Jio(String Ceo,int NetworkId)
    {
        this.NetworkId = NetworkId;
        this.Ceo = Ceo;
        System.out.println("Intializing :: jio Network "+ NetworkId);
        System.out.println("Welcome To jio Services "+Ceo);
    }

    public void calling()
    {
        System.out.println("Calling ::  feature Activated!");
    }
    public void data()
    {
        System.out.println("data :: feature Activated");
    }


}
