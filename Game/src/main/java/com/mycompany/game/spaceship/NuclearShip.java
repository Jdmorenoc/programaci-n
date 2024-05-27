package com.mycompany.game.spaceship;

public class NuclearShip {
    private String name;
    private boolean armed;
    private int crew;      //Tripulacion
    private int damage;
    private int health;
    private int speed;

    public NuclearShip(String name, boolean armed, int crew, int damage, int health, int speed) {
        this.name = name;
        this.armed = armed;
        this.crew = crew;
        this.damage = damage;
        this.health = health;
        this.speed = speed;
    }
    
    
    final void fly() { // Indica que no se puede cambiar y hacer sobrecarga
        System.out.println("A volar!" );
    }
    
    public void shoot(){
        System.out.println("A disparar");
    }
    
    public void maneuver() {
        System.out.println("");
    }
    
}
