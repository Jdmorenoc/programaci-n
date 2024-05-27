package com.mycompany.game;

import com.mycompany.game.spaceship.MilleniumFalcon;
import com.mycompany.game.spaceship.StellarDestroyer;

public class Game {

    public static void main(String[] args) {
        StellarDestroyer stellarDestroyer = new StellarDestroyer(true, true, "Navy1", true, 4, 20, 100, 200);        
        stellarDestroyer.shoot();
        
        MilleniumFalcon milleniumFalcon = new MilleniumFalcon(true, 2, false, "Navy2", true, 5, 40, 100, 300);
        milleniumFalcon.shoot();
    }
}
