package com.mycompany.sportscenter.people;

import com.mycompany.sportscenter.Role;
import com.mycompany.sportscenter.TypeSport;

public class Sportsman extends Person implements Dopping, Diet {
    private TypeSport typeSport;
    private Category category;

    public Sportsman(TypeSport typeSport, Category category, String name, String ID, int age, String gender, Role role) {
        super(name, ID, age, gender, role);
        this.typeSport = typeSport;
        this.category = category;
    }

    @Override
    public void doDoppingTest() {
        System.out.println("Realizando test de dopaje");
    }    

    @Override
    public void doDiet() {
        if(this.typeSport == TypeSport.BASKETBALL){
            System.out.println("Dieta basketbolera");
            return;
                    
        }if(this.typeSport == TypeSport.SOCCER){
            System.out.println("Dieta futbolera");
            return;
                    
        }if(this.typeSport == TypeSport.VOLLEYBALL){
            System.out.println("Dieta voleibolera");
        }
    }
}
