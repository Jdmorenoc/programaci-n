
package com.mycompany.poo;

public class POO {

    public static void main(String[] args) {
       Character homero = new Character("Homero", "Inspector de seguridad", 38, "A la grande le puse cuca");
       homero.greeting();
       
       Character bart = new Character("Bartolomeo", "Vago", 10, "Ayyy caramba");
       bart.greeting();
    }
    
    static class Character {
       String name;
       String ocupation;
       int age;
       String phrase;

        public Character(String name, String ocupation, int age, String phrase){
            this.name = name;
            this.ocupation = ocupation;
            this.age = age;
            this.phrase = phrase;
        }
       
        
        
       void greeting(){
           System.out.println(this.phrase);
       }
    }   
}
