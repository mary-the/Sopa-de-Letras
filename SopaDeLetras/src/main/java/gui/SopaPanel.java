/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JPanel;
import objects.Celdas;

/**
 *
 * @author Maryt
 */
public class SopaPanel extends  JPanel implements ActionListener  {
    private int FILAS;
    private int COLUMNAS;
    String[] Palabras;
    JButton[][] CUADRO;
    Celdas[][] celda;
    String pal="";
    public int i;
    public int j;
    Color babyBlue=new Color(189,238,222);
    public SopaPanel(Celdas[][] matriz,int filas,int columnas,String[] palabras){
        
       Color p= new Color(247, 187, 205);
       
       super.setBackground(p); 
       super.setLayout(null);//***
       
        
        this.celda=matriz;
       
        CrearBotones(filas,columnas);   //Depende de el nivel
/*    
        for (int v = 0; v < Palabras.length; v++) {
            Palabras[v]=new String();
        }*/
        this.Palabras=palabras; 
        
    }
    
    public void CrearBotones(int filas, int columnas){
        this.COLUMNAS=columnas;
        this.FILAS=filas;
        super.setLayout(new GridLayout(filas,columnas));
        int t=filas*columnas;
        
                if((t>=100)&&(t<=200)){
                  setPreferredSize(new Dimension(600, 650));
                }
                if((t>200)&&(t<=500)){
                 setPreferredSize(new Dimension (800, 850));
                }
                if((t>500)&&(t<=800)){
                 setPreferredSize(new Dimension(1000, 1050));
                }
                if((t>800)&&(t<=1000)){
                    System.out.println("entra");
                 setPreferredSize(new Dimension( 1500, 1550));
                }
                if((t>1000)&&(t<2000)){
                  setPreferredSize(new Dimension( 3500, 3550));
                }
                if((t>10000)&&(t<20000)){
                setPreferredSize(new Dimension(4000, 4500));
                }
                if((t>15000)&&(t<25000)){
                  setPreferredSize(new Dimension(5000, 5500));
                }

        CUADRO= new JButton[COLUMNAS][FILAS]; 
       
       
       //   M A T R I Z E S  TIME xD
       for (int i = 0; i < filas; i++) { 
                for (int j = 0; j < columnas; j++) {
                    this.i=i;
                    this.j=j;
                    
                    if(celda[i][j].getLetra()==0){
                    celda[i][j].setLetra((char)((int)Math.floor(Math.random()*(90 - 65)+65)) );
                    celda[i][j].setArt(1);
                    }
                    
                    //celda[i][j].setM(filas); //***************R U SURE?
                    //celda[i][j].setN(columnas); //***************R U SURE?
                    
                    CUADRO[i][j]=new JButton();
                    String s = new StringBuilder().append("").append(celda[i][j].getLetra()).toString();
                    CUADRO[i][j].setText(s);
                    CUADRO[i][j].setBackground(babyBlue);
                    CUADRO[i][j].addActionListener(this);
                    add(CUADRO[i][j]);

                }
                
                       
        }
       
       
       
    }

    public int getI() {
        return i;
    }

    public int getJ() {
        return j;
    }
    
    public void validar(){
        System.out.println("Entro a validar");
        
        for (int r = 0; r < Palabras.length; r++) {
            System.out.println("length:"+Palabras.length);
            System.out.println("pal"+pal);
            System.out.println(Palabras[r]);
            
            if(Palabras[r].equals(pal)){
                System.out.println("equals");
                System.out.println(FILAS+","+COLUMNAS);
                    for (int h = 0; h < FILAS; h++) { 
                        for (int j = 0; j < COLUMNAS; j++) {
                            System.out.println("y aqui");
                            if(celda[h][j].getSelecc()>0){
                                System.out.println("si");
                                    celda[h][j].setSelecc(0);
                                    CUADRO[h][j].setEnabled(false);  
                            }
                            
                        }          
                    }
                    
            }
        }
        pal="";
            for (int h = 0; h < FILAS; h++) { 
                            for (int j = 0; j < COLUMNAS; j++) {
                                if(celda[h][j].getSelecc()>0){
                                    celda[h][j].setSelecc(0);
                                    CUADRO[h][j].setBackground(babyBlue); 
                                }
                            }          
             }
    }
    

					
  
    
    public void resolver(){
    
        for (int i = 0; i < FILAS; i++) { 
                for (int j = 0; j < COLUMNAS; j++) {
                    if(celda[i][j].getArt()==0){
                        CUADRO[i][j].setEnabled(false);
                    }
                }          
        }   
        
    }


      public void actionPerformed(ActionEvent e) {
          System.out.println("e:"+e.getActionCommand());
          System.out.println(pal);
          pal=pal+e.getActionCommand();
          Object fuente = e.getSource();
          
          for (int k = 0; k < FILAS; k++) {
              for (int l = 0; l < COLUMNAS; l++) {
                  
                  if(fuente==CUADRO[k][l]){
                      
                  CUADRO[k][l].setBackground(Color.BLUE);
                  celda[k][l].setSelecc(7);
                  }
              }
          }
    }
}
