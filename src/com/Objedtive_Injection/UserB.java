package com.Objedtive_Injection;

public class UserB {

    private CostlyResource Cr;

    UserB(CostlyResource cr)
    {
        this.Cr = cr;
        this.Cr.show();
    }

}
