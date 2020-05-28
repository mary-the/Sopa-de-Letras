/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import static java.awt.BorderLayout.CENTER;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Maryt
 */
public class principalFrame extends JFrame {
    
    private inicioPanel inicioFondo = new inicioPanel();
    private JButton button;
     
    public principalFrame(){
       super.setSize(1000,700);
       super.setResizable(false);
       this.setLocationRelativeTo(null);
       super.setLayout(null);
       
       Color p= new Color(247, 187, 205);  
       
       
       super.setContentPane(inicioFondo);
       
        Font fuente=new Font("Arial", Font.PLAIN, 50);
       
       
       button=new JButton();
       button.setText("Jugar");
       button.setFont(fuente);
       button.setBounds(300,35,500,500);
       button.setBackground(p);
       button.addActionListener(new ActionListener() {
            @Override
           public void actionPerformed(ActionEvent e) {
             nivelFrame nivelFrm = new nivelFrame();
             nivelFrm.setVisible(true);
             dispose();
             
           }
           
        });

       super.add(button);
       super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       super.setVisible(true);
       //inicioFondo.setOpaque(false);
       }
}
