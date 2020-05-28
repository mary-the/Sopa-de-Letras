/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controler;

import java.io.File;
import java.util.Arrays;

/**
 *
 * @author Maryt
 */
public class ControladorNivel {
      
    
    
    public String[] controladorNivel(){
        File dir = new File("C:/Users/Maryt/Documents/NetBeansProjects/SopaDeLetras/src/main/java/ArchivosNiveles");
        String[] ficheros = dir.list();
            if (ficheros == null)
                System.out.println("No hay ficheros en el directorio especificado");
            else { 
            }
        
            return dir.list();
    }
}
