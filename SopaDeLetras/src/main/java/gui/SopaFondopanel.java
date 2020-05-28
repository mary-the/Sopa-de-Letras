/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import Controler.Juego;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingUtilities;
import objects.Celdas;

/**
 *
 * @author Maryt
 */
public class SopaFondopanel extends JPanel {
    
     private SopaPanel sopa;
     JScrollPane scrollPaneles;
     JScrollPane scrollPaneles2;
     private PanelPalabras palabrasPnl;
     JButton resolve;
     JButton Comp;
     
     public SopaFondopanel(Celdas[][] matriz,int filas, int columnas,String[] palabras){
       Color p= new Color(219, 189, 238);
       super.setBackground(p);   
       super.setLayout(null);
       setPreferredSize(new Dimension(600, 650));
       
      sopa= new SopaPanel(matriz,filas,columnas,palabras);
     
      scrollPaneles=new JScrollPane(sopa);
      scrollPaneles.setBounds(5, 5, 600, 650);
      
      palabrasPnl=new PanelPalabras(palabras);
      scrollPaneles2=new JScrollPane(palabrasPnl);
      scrollPaneles2.setBounds(650, 5, 250,500);
      
      resolve=new JButton();
      resolve.setText("RESUELVELO"); 
      resolve.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
           
               sopa.resolver();
               
           }
        });
      resolve.setBounds(650, 550, 100, 50);
      
      Comp=new JButton();
      Comp.setText("VALIDAR"); 
      Comp.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
           
               sopa.validar();
               
           }
        });
      Comp.setBounds(650, 600, 100, 50);
      
      
      
      add(scrollPaneles2);
      add(scrollPaneles);
      add(resolve);
      add(Comp);
       
       
       
    }
   
    
}
