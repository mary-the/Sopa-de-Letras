/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.Color;
import java.awt.Dimension;
import java.io.File;
import java.util.Arrays;
import javax.swing.JFrame;
import javax.swing.JScrollPane;

/**
 *
 * @author Maryt
 */
public class nivelFrame extends JFrame{
    
    
    private nivelPanel nivelPnl;
    
    public nivelFrame(){

        super.setSize(1000,700);
        super.setResizable(false);
        this.setLocationRelativeTo(null);

        nivelPnl= new nivelPanel();
        super.setContentPane(nivelPnl); 
        
      
        
      
       super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       super.setVisible(true);
    
    }
}
