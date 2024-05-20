package global.inheritance;

import global.inheritance.people.Administrative;
import global.inheritance.people.Person;

public class Inheritance {

    public static void main(String[] args) {
        Person person = new Person("01", "Ana", 3);
        System.out.println("Persona");
        person.fingerPrintRegistry();
        
        System.out.println("Hola tu nombre es: "+ person.getName());
        
        Administrative admin = new Administrative("02", "Pedro", 35, "Divisis");
        System.out.println("Hola, lo hemos identificado como: "+ admin.getName());
        System.out.println("Administrativo");
        admin.fingerPrintRegistry();
        
        
    }
}
