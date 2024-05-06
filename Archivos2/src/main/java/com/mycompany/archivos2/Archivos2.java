package com.mycompany.archivos2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Archivos2 {

    public static void main(String[] args) throws IOException {
        File file = new File("./archivo.txt");
        file.createNewFile(); //Crear un metodo para crear archivos
        
        FileWriter writer = new FileWriter(file);
        PrintWriter pw = new PrintWriter(writer);
        
        for(int i = 0; i<10; i++) {
            pw.println("Linea "+ i);
            
            
        }
    }
}
