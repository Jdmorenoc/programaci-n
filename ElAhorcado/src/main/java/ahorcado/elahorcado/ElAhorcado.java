package ahorcado.elahorcado; 

import java.util.Scanner;

        
public class ElAhorcado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String palabraSecreta = "ESTRELLA"; // Palabra a adivinar
        char[] palabraAdivinada = new char[palabraSecreta.length()];
        int intentos = 6; // Número máximo de intentos

        // Inicializar la palabra a adivinar con guiones bajos
        for (int i = 0; i < palabraAdivinada.length; i++) {
            palabraAdivinada[i] = '_';
        }

        while (intentos > 0) {
            System.out.println("Palabra a adivinar: " + String.valueOf(palabraAdivinada));
            System.out.print("Ingresa una letra: ");
            char letra = scanner.next().toUpperCase().charAt(0);

            try {
                boolean letraAdivinada = false;
                for (int i = 0; i < palabraSecreta.length(); i++) {
                    if (palabraSecreta.charAt(i) == letra) {
                        palabraAdivinada[i] = letra;
                        letraAdivinada = true;
                    }
                }

                if (!letraAdivinada) {
                    intentos--;
                    System.out.println("Letra incorrecta. Te quedan " + intentos + " intentos.");
                } else {
                    System.out.println("¡Correcto!");
                }

                if (String.valueOf(palabraAdivinada).equals(palabraSecreta)) {
                    System.out.println("¡Ganaste! La palabra era: " + palabraSecreta);
                    break;
                }
            } catch (Exception e) {
                System.out.println("Error: Ingresa una sola letra.");
            }
        }

        if (intentos == 0) {
            System.out.println("¡Perdiste! La palabra era: " + palabraSecreta);
        }
    }
}