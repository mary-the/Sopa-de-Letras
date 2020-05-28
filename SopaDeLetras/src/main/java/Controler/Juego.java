/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controler;
import objects.Celdas;

import java.io.FileNotFoundException;

/**
 *
 * @author Maryt
 */
public class Juego {
    
    
    public int lineas;
   public int columnas;
    String[][] L;
    public int m;
    public int n;
    public int numP;
    String palabras[];
    
    public  Juego(String nivel) throws FileNotFoundException{
        LeerArchivo a =new LeerArchivo(nivel);
        
        
        
        this.columnas=a.getColumnas();
        this.lineas=a.getLineas();
        this.L=a.getL();
        
        setMN();
        setNumP();
        setPalabras();
        System.out.println(getM());
        System.out.println(getN());
        System.out.println(getNumP());
        System.out.println(getPalabras());
        
        
    
        
    }
    
    public Celdas[][] matriz (){
        Matriz matriz= new Matriz(n,m,numP,palabras);
        return matriz.crearMatriz();
    }

    public String[] getPalabras() {
        return palabras;
    }

    public void setPalabras() {
        verL();
        System.out.println("numP:"+numP);
        palabras = new String[numP];
        int c=numP+2;
        int x=0;
        for(int i=2; i<(c); i++) {
              
            System.out.println("linea"+i+L[i][0]); 
            palabras[x]=L[i][0];
            x++;
        }
    }
    public void verL(){
    for(int i=0; i<lineas; i++) {
          for(int j=0; j<columnas; j++) {
              
            System.out.print("linea"+i+","+j+":"+L[i][j]+"\t"); 
            System.out.println("0");
          }
          System.out.println();
        }
    }

    
    public void setMN () {
        String string = L[0][0];
        String[] parts = string.split(" ");
        this.m = Integer.parseInt(parts[0]); 
        this.n = Integer.parseInt(parts[1]);
    }
    public void setNumP () {
        numP=Integer.parseInt(L[1][0]);
    }
 
    public int getM() {
        return m;
    }

    public int getN() {
        return n;
    }
    
    public int getNumP() {
        return numP;
    }

    
    
    
    
}
