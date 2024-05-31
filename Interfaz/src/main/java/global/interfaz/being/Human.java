package global.interfaz.being;

public class Human implements Move {
    private int height;
    private String name;
    
    @Override
    public void walk(){
        System.out.println("Estoy caminando erguido");
    }
    
    @Override
    public void run() {
        System.out.println("Corriendo como Naruto");
    }

    public Human(int height, String name) {
        this.height = height;
        this.name = name;
    }
    
    
    
}
