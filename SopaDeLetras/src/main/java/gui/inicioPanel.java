/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Transparency;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Maryt
 */
public class inicioPanel extends JPanel {
    
    private Image imagen;
   
    public inicioPanel(){
       Color p= new Color(247, 187, 205);
       super.setBackground(p); 
       super.setLayout(null);
       
    }
                                //Profe:
 //PROFE SI VE ESTO, NECESITO AYUDA POR QUE NO PUDE INSERTAR LA IMAGEN EN EL JPANEL
    //...
 /*
    @Override
    public void paint(Graphics grafico) {
        
        imagen= new ImageIcon(this.getClass().getResource("C:/Users/Maryt/Documents/NetBeansProjects/SopaDeLetras/src/main/java/gui/inicio.jpg")).getImage(); 
        grafico.drawImage(imagen, 0, 0, getWidth(),getHeight(),this);
 
        
        
        setOpaque(true);
        super.paintComponent(grafico);
  
    }
    */       
}
