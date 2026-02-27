/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package cm69ikereducastur.com.archivosclase;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 1dawd23
 */
public class ArchivosClase {
    
    public static void main(String[] args) {
    //ARCHIVOS EN JAVA (Con File)
    
    //EJEMPLO 1: programa que muestra información básica sobre un archivo.
    /*File f = new File("Prueba.txt"); //Declaración de un archivo
    try {
        f.createNewFile(); //Si no pones un try-catch, Java te advertirá.
 } catch (IOException e) {
    System.out.println(e.getMessage());
 }
    System.out.println("Nombre: " + f.getName());
    System.out.println("Ruta: " + f.getAbsolutePath() );
    System.out.println("Tamaño en Bytes: " + f.length() );
    System.out.println("Fecha Última modificación: " + new Date (f.lastModified()));*/
    
    
    
    //EJEMPLO 2: programa que borra un archivo y le cambia el nombre a otro.
    /*Scanner sc = new Scanner(System.in);
    
    System.out.println("Archivo a eliminar: ");
    String nombre = sc.nextLine();
    
    File f = new File(nombre);
    System.out.println(f.getAbsolutePath());
        if(f.delete()){
            System.out.println("Archivo eliminado");
        } else{
            System.out.println("No se ha podido eliminar");
        }
        
    
    System.out.println("Nombre del Archivo a renombrar: ");
    nombre = sc.nextLine();
    File f1 = new File(nombre);
    
    System.out.println("Nuevo nombre? ");
    String nombre2 = sc.nextLine();
    File f2 = new File(nombre2);
    
        if(f1.renameTo(f2)){
            System.out.println("Se ha cambiado el nombre");
        } else{
            System.out.println("No se ha podido cambiar el nombre");
        }*/
    
    
    //FICHEROS:
    //EJEMPLO 1: ESCRITURA en un archivo de texto (añadiendo líneas a las ya existentes)
    
    
        /*Scanner sc=new Scanner(System.in);
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("archivo1.txt",true))) {
            String cadena;
            System.out.println("Teclea líneas de texto + RETORNO - (FIN para terminar)");
            cadena = sc.nextLine();
            
        while (!cadena.equalsIgnoreCase("FIN")) {
            bw.write(cadena); //escribe la cadena en el BufferedWriter
            bw.newLine(); //añade un salto de línea
            cadena = sc.nextLine(); //Solicita una nueva cadena
        }
        } catch (IOException e) {
            System.out.println("No se ha podido escribir en el fichero");
        }
    }*/
    
    
        //Ejemplo 4: Ejemplo de Lectura desde archivos de texto (con la clase Scanner)
        try (Scanner scf = new Scanner(new File("archivo1.txt"))) {
        while (scf.hasNextLine()) {
            System.out.println(scf.nextLine());
        }
        }
        catch (FileNotFoundException E){
            System.out.println("El archivo NO EXISTE");
        }
    }
    
    
    
    
    
}
