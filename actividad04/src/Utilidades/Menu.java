/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilidades;

/**
 *
 * @author Fernando.Ariza
 */
public class Menu {
    
    /**
    * @Desc: Imprime el menú de la App por pantalla.
    * @param : N/A
    * @return: N/A
    */
    
    public static void ImprimeMenu(){
          
        
        System.out.println(" * * *  M E N U * * * ");
        System.out.println("");
        System.out.println("1.- Crear un nuevo archivo");
        System.out.println("2.- Listar Archivos");
        System.out.println("3.- Mostrar archivo");
        System.out.println("4.- Borrar archivo");
        System.out.println("5.- Modificar archivo");
        System.out.println("6.- Renombrar archivo");
        System.out.println("");
        System.out.println("7.- Salir de la app");
    
    }    
        
    /**
    * @Desc: Imprime por pantalla la cabecera de la opcion seleccionada por el usuario.
    * @param : Recibe el valor Int que ha introducido el usuario al seleccionar la opcion de la app.
    * @return: N/A
    */
    
    public static void ImprimeCabeceraConOpcion(int valorMenu){
    
        System.out.println("**************");
        System.out.println("** OPCION " + valorMenu + " **");
        System.out.println("**************");
    
    };
    
}
