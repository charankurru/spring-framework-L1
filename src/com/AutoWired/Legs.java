package com.AutoWired;

public class Legs implements  Organ{
    private  int num;
    private  String type;

    public void setNum(int num) {
        this.num = num;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void organ_details() {
        System.out.println("Number of legs is: "+num);
        System.out.println("Legs  type is "+type);
    }
}
