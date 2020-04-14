package Utilidades;

import java.io.IOException;

/**
* @Desc: Clase publica que contiene las funciones genericas
* @param : N/A
* @return: N/A
*/

public class Genericas {
    
    /**
    * @Desc: Inserta 100 lineas en blanco, dando la sensacion de limpiar la pantalla
    * @param : N/A
    * @return: N/A
    */
    
    public static void limpiarPantalla() {

        for (int i = 0; i < 100; i++) {

        System.out.println("");

        }
        
    }
    
    
    /**
    * @Desc: Pausa la ejecucion del progama para que el usuario pueda leer los mensajes. Se reanuada la ejecucion pulsado Intro.
    * @param : N/A
    * @return: N/A
    */
        
    public static void pausa() throws IOException {

        System.out.println("Presione intro para volver al menú...");
        System.in.read();
    }
    
}
