package EntradaDeDatos;

import java.util.Scanner;

/**
* @Desc: Clase publica que contiene las funciones que solicitan datos de texto al usuario
* @param : N/A
* @return: N/A
*/
public class ValoresDeTexto {
    
    /**
    * @Desc: Solicita al usuario que introduzca un valor Integer. La funcion controla que el valor es correcto o devuelve un error. 
    * @param : La funcion recibe un String con el texo que se mostrará al usuaio
    * @return: La funcion devulve un String, una vez comprobado que el valor es correcto.
    */
    
    public static String PideTexto(String pregunta){
   
      String valor = null;
      
      System.out.println(pregunta);
      
      do{
      
         Scanner MyObj = new Scanner(System.in);
         valor = MyObj.nextLine();
                           
         if (valor.equals("")){
         
             System.out.println("El valor no puede quedar vacio. Introduzca un nuevo nombre.");
                                  
         } else if(!valor.matches(".*[a-zA-Z0-9.].*")){
      
             System.out.println("El nombre del fichero solo puede contener letras o numeros. Introduzca un nuevo nombre");
             valor = "";         
         }  

      
      } while(valor.equals(""));
       
         
   return valor;
   }
    
    
    
}
