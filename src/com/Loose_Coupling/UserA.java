package com.Loose_Coupling;

public class UserA {
    private Cluster costly_resource;

    public void setCostly_resource(Cluster cr)
    {
        this.costly_resource=cr;
    }

    public void Display_resource()
    {
        this.costly_resource.show();
    }

}
