package global.practica;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Contenido {
    
    public static void CreateFile() throws IOException {
        File file = new File("./Archivo.txt");
        file.createNewFile();
        
    }
    
    public static void TextFile(String Contenido) {
        File file = new File("./Archivo.txt");
        
        try {
            FileWriter wr = new FileWriter(file, true);
            PrintWriter pw = new PrintWriter(wr);
            pw.println(Contenido);
            pw.close();
            System.out.println("Se ha escrito en el archivo creado");
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
    
    public static void ReadFile( ) throws IOException{
        File file = new File("./Archivo.txt");
        try{
            FileReader fr = new FileReader(file);
            BufferedReader entrada = new BufferedReader(fr);
            String lectura = entrada.readLine();
            while(lectura != null){
                System.out.println(lectura);
                lectura = entrada.readLine();               
            } entrada.close();
            
        } catch(FileNotFoundException e){
            e.printStackTrace();
        }
    }
    
    public static void DeleteFile(){
        File file = new File("./Archivo.txt");
        System.out.println("El archivo existe?: " + file.exists());
        file.delete();
        System.out.println("Se ha eliminado el archivo");
        
    }
}
