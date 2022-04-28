package lecturaescritura;

import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 * Class LecturaEscritura. Patricia Cambronero Morales 
 * @version 1.1
 * @author b14-07m
 * @date 20 abr 2022

 */
public class LecturaEscritura {

    /**
     *Lee una cadena por teclado, y si no está 
     * vacía, laguarda(escribe) en un fichero.
     * Stream type:Character, Output(clase FileWriter)
     * Introducimos nuevo cambio
     */
    public static void main(String[] args) throws IOException {
        String texto=JOptionPane.showInputDialog("Teclea texto");
        
        if(texto.isBlank()){
            //No hay nada que escribir 
            return;
        }
        //Escribe el texto 
        // Stream type:Character, Output(clase FieWriter)
        try{
        //1.Crear objeto
        FileWriter fichero =new FileWriter("TEXTO-20-4-22.txt");
        
        //2.Escribir 
        //fichero.write(texto, 0, texto.length());
        fichero.write(texto);
        
        //3.Cerrar
        fichero.close();
        
        }catch (IOException e){
            System.out.println("ERROR E/S:"+e);
            
            
        }
        //Modificación
    }

}
