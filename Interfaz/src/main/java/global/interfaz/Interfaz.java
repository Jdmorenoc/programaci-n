package global.interfaz;

import global.interfaz.being.Human;

public class Interfaz {

    public static void main(String[] args) {
        Human human = new Human(170, "Fulanito");
        human.walk();
    }
}
