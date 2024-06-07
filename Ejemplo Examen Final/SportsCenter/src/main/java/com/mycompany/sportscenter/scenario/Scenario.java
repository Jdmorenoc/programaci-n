package com.mycompany.sportscenter.scenario;

import com.mycompany.sportscenter.TypeSport;

public class Scenario {
    private int capacity;
    private TypeSport typeSport;
    
    private String chedule;
    private boolean avaliable;

    public Scenario(int capacity, TypeSport typeSport, String chedule) {
        this.capacity = capacity;
        this.typeSport = typeSport;
        this.chedule = chedule;
        this.avaliable = true;
    }

    public boolean isAvaliable() {
        return avaliable;
    }

    public void setAvaliable(boolean avaliable) {
        this.avaliable = avaliable;
    }

    
}
