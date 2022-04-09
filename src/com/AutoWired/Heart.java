package com.AutoWired;

public class Heart implements  Organ{
    private int num;
    private String type;

    public void setNum(int num) {
        this.num = num;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void organ_details()
    {
        System.out.println("Number of hearts is: "+num);
        System.out.println("Heart  type is "+type);
    }
}
