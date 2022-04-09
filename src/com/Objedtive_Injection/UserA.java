package com.Objedtive_Injection;

public class UserA {
    private CostlyResource Cr;

//    UserA(CostlyResource cr)
//    {
//        this.Cr = cr;
//        this.Cr.show();
//    }
    public void setCr(CostlyResource obj)
    {
        this.Cr = obj;
        this.Cr.show();
    }


}
