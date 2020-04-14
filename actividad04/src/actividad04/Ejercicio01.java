/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad04;

import Utilidades.*;
import java.io.*;
import EntradaDeDatos.*;

/**
 *
 * @author Fernando.Ariza
 */
public class Ejercicio01 {

    static String ruta = System.getProperty("user.dir");
    static String separador = File.separator;

    
    /**
    * @Desc: Arranca la ejecucion del programa mostrando el menú
    * @param : Recibe un Array de tipo String con argumento (No son necesarios)
    * @return: N/A
    */
    
    
    
    public static void main(String[] args) throws IOException {

        int valorMenu;
        boolean avanzar = false;
        int ficheroSeleccionado;
        String rutaDelFichero;  
       
        
        Genericas.limpiarPantalla();
        CompruebaCarpeta();

        do {

            Menu.ImprimeMenu();
            valorMenu = ValoresNumericos.pideEntero("Selecciona una opción");
            


            switch (valorMenu) {
               
                case 1:

                    Genericas.limpiarPantalla();
                    
                    Menu.ImprimeCabeceraConOpcion(valorMenu);

                    String NombreFichero = ValoresDeTexto.PideTexto("Introduce el nombre del fichero a crear:");


                    OperacionesConFicheros.Fichero(NombreFichero);

                    Genericas.pausa();
                    
                    Genericas.limpiarPantalla();
                
                break;
          
                case 2:
                            
                    Genericas.limpiarPantalla();
                    
                    Menu.ImprimeCabeceraConOpcion(valorMenu);
                    
                    OperacionesConFicheros.ListarFicherosEnCarpetaArchivos();
                            
                    Genericas.pausa();
                            
                    Genericas.limpiarPantalla();
                            
                break;
                            
                case 3:
                    
                    Genericas.limpiarPantalla();
                    
                    Menu.ImprimeCabeceraConOpcion(valorMenu);
                           

                    do {
                        try {
                            
                            String[] listado = OperacionesConFicheros.ListarFicherosEnCarpetaArchivos();
                            
                            ficheroSeleccionado = ValoresNumericos.pideEntero("Introduce el numero de fichero a mostrar por consola: ");
                    
                            rutaDelFichero = listado [(ficheroSeleccionado - 1)];
                            
                            OperacionesConFicheros.LeerContenidoFichero(rutaDelFichero);

                            Genericas.pausa();

                            Genericas.limpiarPantalla();
                            
                            avanzar = true;
                            
                        }catch(ArrayIndexOutOfBoundsException e){
                            
                            System.out.println("El valor introducido, no es ningun valor del listado. Introduzca un valor valido.");
                            
                            Genericas.pausa();

                            Genericas.limpiarPantalla();
                            
                            avanzar = false;
                        
                        }
                                              
                    }while (!avanzar);
                    
                    avanzar = false;
                            
                break;
                            
                case 4:
                    
                    Genericas.limpiarPantalla();
                    
                    Menu.ImprimeCabeceraConOpcion(valorMenu);

                    do{
                    
                        try {
                            
                            String[] listado = OperacionesConFicheros.ListarFicherosEnCarpetaArchivos();

                            ficheroSeleccionado = ValoresNumericos.pideEntero("Introduce el numero de fichero a ¡¡ BORRAR !!: ");

                            rutaDelFichero = listado [(ficheroSeleccionado - 1)];

                            OperacionesConFicheros.BorrarFicheroSeleccionado(rutaDelFichero);

                            Genericas.pausa();

                            Genericas.limpiarPantalla();

                            avanzar = true;

                        }catch(ArrayIndexOutOfBoundsException e){

                            System.out.println("El valor introducido, no es ningun valor del listado. Introduzca un valor valido.");

                            Genericas.pausa();

                            Genericas.limpiarPantalla();

                            avanzar = false;

                        }
                                              
                    }while (!avanzar);
                    
                    avanzar = false;
                            
                    break;
                            
                case 5:
                    
                    Genericas.limpiarPantalla();
                    
                    Menu.ImprimeCabeceraConOpcion(valorMenu);
                    
                    do{
                    
                        try {
                            
                            String[] listado = OperacionesConFicheros.ListarFicherosEnCarpetaArchivos();

                            ficheroSeleccionado = ValoresNumericos.pideEntero("Introduce el numero de fichero a modificar");

                            rutaDelFichero = listado [(ficheroSeleccionado - 1)];

                            OperacionesConFicheros.ModificarFicheroSeleccionado(rutaDelFichero);

                            Genericas.pausa();

                            Genericas.limpiarPantalla();

                            avanzar = true;

                        }catch(ArrayIndexOutOfBoundsException e){

                            System.out.println("El valor introducido, no es ningun valor del listado. Introduzca un valor valido.");

                            Genericas.pausa();

                            Genericas.limpiarPantalla();

                            avanzar = false;

                        }
                                              
                    }while (!avanzar);
                    
                    avanzar = false;
                            
                    break;
                    
                            
     
                case 6:
                    Genericas.limpiarPantalla();
                    
                    Menu.ImprimeCabeceraConOpcion(valorMenu);
                    
                    do{
                    
                        try {
                            
                            String[] listado = OperacionesConFicheros.ListarFicherosEnCarpetaArchivos();

                            ficheroSeleccionado = ValoresNumericos.pideEntero("Introduce el numero de fichero a modificar");

                            rutaDelFichero = listado [(ficheroSeleccionado - 1)];

                            OperacionesConFicheros.RenombarFicheroSeleccionado(rutaDelFichero);

                            Genericas.pausa();

                            Genericas.limpiarPantalla();

                            avanzar = true;

                        }catch(ArrayIndexOutOfBoundsException e){

                            System.out.println("El valor introducido, no es ningun valor del listado. Introduzca un valor valido.");

                            Genericas.pausa();

                            Genericas.limpiarPantalla();

                            avanzar = false;

                        }
                                              
                    }while (!avanzar);
                    
                    avanzar = false;
                            
                    break;
                        
                default:
                    
                    if(valorMenu != 7){
                        
                        System.out.println("El valor introducido, no es valido.");
                        System.out.println("Selecciona una opción");
                    } else {
                    
                        System.out.println("Hasta Nunca!");
                    }
                    
                    break;
            }
                    
        }while (7 != valorMenu);
        
    }

    
    /**
    * @Desc: Comprueba que existe la carpeta Archivos. Si no es asi, la crea.
    * @param : N/A
    * @return: N/A
    */
    
    public static void CompruebaCarpeta() {

        File CarpetaArchivos = new File(ruta + separador + "Archivos");

        if (!CarpetaArchivos.exists()) {

            CarpetaArchivos.mkdir();

        }

    }
    
}


    

