package poo_archivoplano_180923;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.Path;
import static java.nio.file.StandardOpenOption.*;

public class POO_ArchivoPlano_180923 {

    
//    public static void main(String[] args) throws IOException{
//       
//        // Crear y modificar (leer en archivo)
//        
//        //Ruta de acceso para crear el archivo
//        Path ruta = Paths.get("C:\\Users\\Waira\\POO_ArchivoPlano_180923\\src\\poo_archivoplano_180923\\ArchivoPlano.txt");
//        
//        //Cadena de texto para almacenar en el archivo
//        String contenido = "Este es mi archivo plano";
//        
//        // Esta variable es el puente de comunicación con 
//        // el sistema operativo y Java
//        BufferedWriter escritor = null;
//        
//        try{
//            //Se ubican las operaciones del sistema
//            escritor = Files.newBufferedWriter(ruta, 
//                    CREATE, TRUNCATE_EXISTING);
//            escritor.write(contenido);
//        }catch(IOException ioe){
//            //Genero los errores de ejecucción
//            System.out.println(ioe);
//        }finally{
//            //Cierro proceso inconclusos o abiertos
//            if(escritor != null){
//                escritor.close();
//            }
//        }
//        
//    }
//    
//    public static void main(String[] args) throws IOException{
//       
//        //ABRIR EL DOCUMENTO y modificarlo
//        
//        // Crear la ruta donde almacenado el archivo
//        Path ruta = Paths.get("C:\\Users\\Waira\\POO_ArchivoPlano_180923\\src\\poo_archivoplano_180923\\ArchivoPlano.txt");
//       
//        // Creo la cadena de texto con la información que adiciono
//        String contenido = "\nEl resto de contenido para adicionar";
//        
//        //Puente de acceso al sistema
//        BufferedWriter escritor= null;
//        
//        try{
//            escritor = Files.newBufferedWriter(ruta, APPEND);
//            escritor.write(contenido);
//        }catch(IOException ioe){
//            //Genero los errores de ejecucción
//            System.out.println(ioe);
//        }finally{
//            //Cierro proceso inconclusos o abiertos
//            if(escritor != null){
//                escritor.close();
//            }
//        }
//        
//    }
    
    public static void main(String[] args) throws IOException{
       
        //Leerlo e imprimir lo que tiene el archivo
        //por consola o Jopcion, Buffered
        
        // Crear la ruta donde almacenado el archivo para leer
        Path ruta = Paths.get("C:\\Users\\Waira\\POO_ArchivoPlano_180923\\src\\poo_archivoplano_180923\\ArchivoPlano.txt");
       
        // Creo la cadena de texto con la información que adiciono
        String contenido = "";
        String linea="";

        //Puente de acceso al sistema
        BufferedReader lector= null;
        
        try{
            lector = Files.newBufferedReader(ruta);
            while((linea=lector.readLine())!= null){
                contenido += linea + "\n";
            }
        }catch(IOException ioe){
            //Genero los errores de ejecucción
            System.out.println(ioe);
        }finally{
            //Cierro proceso inconclusos o abiertos
            if(lector != null){
                lector.close();
            }
        }
        
        System.out.println(contenido);
        
    }
    
}
