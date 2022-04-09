package com.ideatester;

public class Airtel implements Sim {

    private String Ceo;
    private int NetworkId;

    public void setCeo(String name)
    {
        this.Ceo = name;
        System.out.println(this.Ceo);
    }

    public void setNetworkId(int num)
    {
        this.NetworkId = num;
        System.out.println(this.NetworkId);
    }

    Airtel()
    {
        System.out.println("Intializing :: Airtel Network");
        System.out.println("Welcome To Airtel Services");
    }

    public void calling()
    {
        System.out.println("Calling ::  feature Activated! "+this.NetworkId);
    }

    public void data()
    {
        System.out.println("data :: feature Activated "+ this.Ceo);
    }

}