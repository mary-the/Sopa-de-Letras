/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import javax.swing.JFrame;
import objects.Celdas;

/**
 *
 * @author Maryt
 */
public class SopaFrame extends JFrame {
    
    
    private SopaFondopanel fondo;
    
    public SopaFrame(Celdas[][] matriz,int filas, int columnas,String[] palabras){

        super.setSize(1000,700);
        super.setResizable(false);
        this.setLocationRelativeTo(null);

        fondo= new SopaFondopanel(matriz,filas,columnas,palabras);
        super.setContentPane(fondo); 
        
       
        
 
      
       super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       super.setVisible(true);
    
    }
    
}
