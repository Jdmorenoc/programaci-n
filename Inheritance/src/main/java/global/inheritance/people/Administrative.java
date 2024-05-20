package global.inheritance.people;

public class Administrative extends Person{
    private String dependency;
    
    public Administrative(String ID, String name, int age, String dependency) {
        super(ID,name, age);
        this.dependency = dependency;
    }
    
    public void seeData() {
        System.out.println("Mostrar datos al administrador");
    }
    
    @Override 
    public void fingerPrintRegistry() {
        System.out.println("Administrativo registrando huella");
    }
    
}
