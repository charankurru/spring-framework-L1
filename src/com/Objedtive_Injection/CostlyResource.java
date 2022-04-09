package com.Objedtive_Injection;

public class CostlyResource {
    private final String system = "Linux_node";
    private final int ram_gb = 8;
    private final String graphics = "AMD_ryzen";

    public void show()
    {
        System.out.println("Using Node"+system);
        System.out.println("using Graphics"+ graphics);
    }

}
