/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package cm69ikereducastur.com.archivosclase;

import java.io.File;
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
    
    //EJEMPLO 1:
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
    
    //EJEMPLO 2:
    Scanner sc = new Scanner(System.in);
    
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
        }
    }
}
