/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import static java.awt.FlowLayout.LEFT;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import Controler.ControladorNivel;
import Controler.LeerArchivo;
import Controler.Juego;
import java.awt.FlowLayout;
import java.awt.Font;
import static java.awt.Font.PLAIN;
import java.awt.GraphicsEnvironment;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.SwingUtilities;
import objects.Celdas;

/**
 *
 * @author Maryt
 */
public class nivelPanel extends JPanel implements ActionListener{
    
    private ControladorNivel controlador;
    private int cantNiveles;
    
    private String n="";
    private JButton boton;
    private nivelesPnl nivelPnl;
    public nivelPanel(){
       
       Color p= new Color(219, 189, 238);
       super.setBackground(p);   
       super.setLayout(null);
       setPreferredSize(new Dimension(600, 650));
       Font fuente=new Font("action man extended", Font.PLAIN, 20);
       nivelPnl=new nivelesPnl();
       controlador= new ControladorNivel();
       String[] niveles=controlador.controladorNivel();
       
       cantNiveles=niveles.length;
        JRadioButton[] nivel = new JRadioButton[cantNiveles]; 
       
        ButtonGroup grupo1 = new ButtonGroup();
//**
         
      
      
      
       for(int i=0;i<cantNiveles;i++){
           nivel [i]=new JRadioButton();
           nivel[i].setBackground(p);
           nivel[i].setSize(100, 100);
           nivel[i].setFont(fuente);
           n=niveles[i];
           nivel[i].setText(n);
           nivelPnl.add(nivel[i]); 
           grupo1.add(nivel[i]);
           
           
       }
       
        JScrollPane scrollPaneles=new JScrollPane(nivelPnl);
        scrollPaneles.setBounds(5, 5, 600, 650);
       
       
       add(scrollPaneles);
       
       boton=new JButton();
       boton.setBounds(650, 15, 300, 600);
       boton.setText("ACEPTAR");
       boton.setFont(fuente);
       boton.setBackground(new Color(182,238,207));
       boton.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
           
               for(int i=0;i<cantNiveles;i++){
                        if(nivel[i].isSelected()){
                            
                         
                                Juego juego; 
                            try {
                                juego = new Juego(niveles[i]);
                                SopaFrame sopa = new SopaFrame(juego.matriz(),juego.getM(),juego.getN(),juego.getPalabras());
                                sopa.setVisible(true);
                                ((JFrame) SwingUtilities.getWindowAncestor(nivelPanel.this)).dispose();
                                 //juego.setNivel(niveles[i]);
                            } catch (FileNotFoundException ex) {
                                Logger.getLogger(nivelPanel.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            
                        }
                
           
           
                }
               
           }
        });
       add(boton);
       
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  

    
    
    
    
}
