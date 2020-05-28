/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Maryt
 */
public class nivelesPnl extends JPanel {
    private JLabel titulo;
    nivelesPnl(){
    Color p= new Color(219, 189, 238);
       super.setBackground(p);   
       super.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
       setPreferredSize(new Dimension(400, 600));
       Font fuente=new Font("Arial", Font.PLAIN, 100);
     
       titulo=new JLabel("               NIVELES");
       titulo.setSize(200,100);
       add(titulo);
    
    
    }
}
