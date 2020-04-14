/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilidades;

import java.io.*;

/**
 *
 * @author Fernando.Ariza
 */
public class OperacionesConFicheros {
    
    static String ruta = System.getProperty("user.dir"); 
    static String separador = File.separator;
    static String extension = ".txt";

    
    static File fichero = new File( ruta + separador + "Archivos");

    
    
    /**
    * @Desc: Crea un nuevo fichero en la carpeta Archivos con extension ".txt"
    * @param : Recibe un String con el nombre del nuevo fichero
    * @return: N/A
    */
    
    public static void Fichero (String NombreFichero) throws IOException{
    
        File ficheroACrear = new File( fichero + separador + NombreFichero + extension);
        
        if (!ficheroACrear.exists()) {                
           
           try {
                
                ficheroACrear.createNewFile();
                System.out.println("El fichero se ha creado correctamente");
  
            } catch (IOException e) {
                
                System.out.println("Se produjo el siguiente error: " + e.getMessage());
                
            }    
            
            
        }
        String ficheroCreado = ficheroACrear.getAbsolutePath();
        ModificarFicheroSeleccionado (ficheroCreado);
        
    }
    
    
    /**
    * @Desc: Lista los ficheros que se encuentran en la carpeta Archivos
    * @param : 
    * @return: Devuelve un Array de tipo String con las rutas absolutas de los ficheros.
    */
        
    public static String[] ListarFicherosEnCarpetaArchivos (){
    
               
        String[] listado = fichero.list();
        
        for (int i=0; i< listado.length; i++) {

        System.out.println((i + 1) + ".- " + listado[i]);

        listado[i] = fichero + separador + listado[i];

        }   
        
        return listado;
        
    }
    
    
    /**
    * @Desc: Lee el contenido del fichero seleccionado por el usuario
    * @param : Recibe un String con el nombre del fichero a leer
    * @return: N/A
    */
    
    public static void LeerContenidoFichero(String rutaDelFichero) throws FileNotFoundException, IOException{
        
        FileReader f = new FileReader(rutaDelFichero);
        File fi = new File(rutaDelFichero);
        String texto;
        try {
            
            BufferedReader br = new BufferedReader(f);
            
            if ( 0 == fi.length()){
                
                System.out.println("El fichero se encuentra vacio");
                
            }else{
                
                texto = br.readLine();
                        
                System.out.println("El contenido del fichero es: " + texto);
                    
                br.close();
                    
            }
            
            
        } catch (IOException e){
            
               System.out.println("La operacion no puede realizarse");
        
        } 

    
    }
       
    
    /**
    * @Desc: Elimina un fichero seleccionado por el usuario
    * @param : Recibe un String con el nombre del fichero a borrar
    * @return: N/A
    */
    
    public static void BorrarFicheroSeleccionado (String rutaDelFichero){
    
        File fi = new File(rutaDelFichero);
        
        fi.delete();
   
    }
    
    
    /**
    * @Desc: Modifica el fichero seleccionado por el usuario
    * @param : Recibe un String con el nombre del fichero a Modificar
    * @return: N/A
    */
    
    
    public static void ModificarFicheroSeleccionado (String rutaDelFichero) throws IOException{
        
        File fi = new File(rutaDelFichero);
        FileWriter fiwr = new FileWriter(rutaDelFichero);
        BufferedWriter bw = new BufferedWriter(fiwr);
        
        if (fi.canWrite()){
            
            String textoAEscribir = EntradaDeDatos.ValoresDeTexto.PideTexto("Introduce el nuevo texto para el fichero");
            bw.write(textoAEscribir);
            bw.flush();
            bw.close();
        
                       
        }else{
        
            System.out.println("No puede escribirse en el fichero");
        }
        
    
    
    }
    
    
    /**
    * @Desc: Modifica el nombre del fichero seleccionado por el usuario
    * @param : Recibe un String con el nombre del fichero a renombrar.
    * @return: N/A
    */
    
    
    public static void RenombarFicheroSeleccionado(String rutaDelFichero){
    
        File fi = new File(rutaDelFichero);
        
        if (fi.canWrite()){
            
            String nuevoNombreFichero = EntradaDeDatos.ValoresDeTexto.PideTexto("Introduce el nuevo nombre para el fichero");
            File newFI = new File( fichero + separador + nuevoNombreFichero + extension);
            fi.renameTo(newFI);
                       
        }else{
        
            System.out.println("No puede escribirse en el fichero");
        }
        
    }
    

 }
