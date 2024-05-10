package com.mycompany.csvfiles;

import com.mycompany.csvfiles.manageFiles.ReadFile;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;



public class CSVfiles {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("./data.csv");  
        
        ReadFile readFile = new ReadFile(file);
        
        List<String> data = readFile.loadData();
        
        for(String line : data) {
            //System.out.println(line);
            String[] splited = new String[3];
            splited = line.split(";");
            System.out.println("Hola " + splited[1] + " " + splited[2] + " tu codigo es: " + splited[0]);
            
            
            //Hacer que ahora cree texto en el archivo 
            
        }
    }
}
