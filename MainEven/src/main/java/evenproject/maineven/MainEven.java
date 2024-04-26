package evenproject.maineven;

import java.util.Scanner;

public class MainEven {

    public static void main(String[] args) {
        System.out.println("Escriba un numero");
        
        Scanner sc = new Scanner(System.in);
        
        int number = sc.nextInt();
        
        Even even = new Even();
        try{
            even.isEven(number);
        }catch (Exception e) {
            System.out.println("Ha ocurrido un error: " + e.getMessage());
        }                
    }
}
