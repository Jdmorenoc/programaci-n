package com.mycompany.sportscenter;

import com.mycompany.sportscenter.scenario.Scenario;
import com.mycompany.sportscenter.sportsCenter.SportCenter;

public class SportsCenter {

    public static void main(String[] args) {
        SportCenter sportCenter = new SportCenter("El Campin", "ASD", "Bogota", "24h" );
        
        Scenario scenario1 = new Scenario(1800, TypeSport.SOCCER, "14h-18h");
        Scenario scenario2 = new Scenario(400, TypeSport.VOLLEYBALL, "18h-22h");
        
        sportCenter.addScenario(scenario1);
        sportCenter.addScenario(scenario2);
        
        sportCenter.
    }
}
