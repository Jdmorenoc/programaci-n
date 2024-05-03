package com.mycompany.ficheros;

import java.io.File;

public class Ficheros {

    public static void main(String[] args) {
        File file = new File("C:/Users/SCIS2PC31/Desktop/Hola.txt");
                
        if(!file.exists()) {
            System.out.println("Nombre: " + file.getName());
            System.out.println("Ruta: " + file.getPath());
            System.out.println("Ruta Absoluta: " + file.getAbsolutePath());
            System.out.println("Permite Escribir: " + file.canWrite());
            System.out.println("Permite Leer: " + file.canRead());
            System.out.println("Tamaño: " + file.length());
            
        }else {
            System.out.println("El fichero no existe");
        }
    }
}
