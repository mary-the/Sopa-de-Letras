/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects;

import gui.SopaPanel;
import javax.swing.JButton;

/**
 *
 * @author Maryt
 */
public class Celdas{
        public char letra=0;
        public int estado=0; //Para checar si esta vacio
        public int art=0;   //Para checar si fue random
        public int selecc=0;
// public int n;
        //public int m;

    public int getSelecc() {
        return selecc;
    }

    public void setSelecc(int selecc) {
        this.selecc = selecc;
    }

    public int getArt() {
        return art;
    }

    public void setArt(int art) {
        this.art = art;
    }
    
   
    public Celdas (/*int m, int n*/){
        
    
    }

    public char getLetra() {
        return letra;
    }

    public int getEstado() {
        return estado;
    }
/*
    public int getN() {
        return n;
    }

    public int getM() {
        return m;
    }
*/

    public void setLetra(char letra) {
        this.letra = letra;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
/*
    public void setN(int n) {
        this.n = n;
    }

    public void setM(int m) {
        this.m = m;
    }
*/
    
  
}
