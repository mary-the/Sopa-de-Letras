/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.Dimension;
import java.awt.Font;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Maryt
 */
public class PanelPalabras extends JPanel{
    
    
    PanelPalabras(String[] palabras){
        
        super.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setPreferredSize(new Dimension(250,1500));
        
        JLabel[] j = new JLabel[palabras.length];
        Font fuente=new Font("Dialog", Font.BOLD, 20);
        
        
           for (int i = 0; i < palabras.length; i++) {
               j[i]=new JLabel();
               j[i].setText(palabras[i]);
               j[i]. setFont ( fuente ) ;
               add(j[i]);
           }
           
    }
    
}
