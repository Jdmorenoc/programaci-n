package global.problema;

import java.io.*;

public class Archivo {
    
    public static void Crear() throws IOException {
        File file = new File("./datos.txt");
        file.createNewFile();
        System.out.println("Se ha creado el archivo");
    }

    public static void VerficarExistencia() throws FileNotFoundException {
        File file = new File("./datos.txt");
        
        try{
            if(file.exists()== true){
                System.out.println("El archivo ya existe");
            }else {
                System.out.println("El archivo no existe");
            }          
        }catch(Exception e){
            e.printStackTrace();
        }
                
    }
    
    public static void Escribir() throws IOException {
        File file = new File("./datos.txt");

        try {
                    
        FileWriter fr = new FileWriter(file, true);
        PrintWriter pw = new PrintWriter(fr);
        
            for(int i = 1; i <= 10; i++){
                pw.println(i);
            }
            pw.close();
            
        } catch(Exception e) {
            System.out.println("No se ha escrito nada en el archivo");
            
        }
        
    }
    
    public static void Leer() throws IOException {
        File file = new File("./datos.txt");
        
        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line = br.readLine();

            while(line != null){
                System.out.println(line);
                line = br.readLine();    
            }br.close();
        
            System.out.println("Se ha leido linea por linea dentro del archivo");
            
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
    
    public static void Suma() throws IOException{

        String fileName = "datos.txt";
        int suma = 0;
        int contador = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                try {
                    int numero = Integer.parseInt(linea);
                    suma += numero;
                    contador++;
                } catch (NumberFormatException e) {
                    System.out.println("Error: La línea \"" + linea + "\" no es un número entero.");
                }
            }
        }
        
       /* catch (FileNotFoundException e) {
            System.out.println("Error: El archivo " + fileName + " no existe.");
        } catch (IOException e) {
            System.out.println("Error: Ocurrió un problema al leer el archivo.");
        }
       */
       
        System.out.println("Total de números leídos: " + contador);
        System.out.println("Suma de los números: " + suma);
    }
    }

