/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controler;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Maryt
 */
public class LeerArchivo {
    public int linea;
    public int columnas;
    String[][] L;
   
    
    public LeerArchivo (String nivel) throws FileNotFoundException{
        
        ArrayList <String[]> AUX = new ArrayList<>();
        int lineas = 0;//Para numero de filas de la matriz
        int cols = 0;//Para numero de columnas de la matriz
        File f = new File("C:/Users/Maryt/Documents/NetBeansProjects/SopaDeLetras/src/main/java/ArchivosNiveles/"+nivel);
        Scanner s;
        try{
        s = new Scanner(f);
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;

        try {
         archivo = f;
         fr = new FileReader (archivo);
         br = new BufferedReader(fr);

         String linea;
         
         while((linea=br.readLine())!=null){
            
            //System.out.println(linea);  //IMPRIME
            AUX.add(linea.split(","));
            lineas++;
         }
        }catch(Exception e){
         e.printStackTrace();
         }finally{
         try{                    
            if( null != fr ){   
               fr.close();     
            }                
         }catch (Exception e2){ 
            e2.printStackTrace();
          }
         }
         s.close();
    } catch (FileNotFoundException e) {
            e.printStackTrace();
    }
    if(AUX.size()>0) {
        System.out.printf("");
        cols = AUX.get(0).length;
        String[][] info = new String[lineas][cols];

        for(int i=0; i<lineas; i++) {
          for(int j=0; j<cols; j++) {
            info[i][j] = AUX.get(i)[j];
           // System.out.print(info[i][j]+"\t");  //IMPRIME
          }
          System.out.println();
        }
/************PRUEBA
        
        for(int i=0; i<lineas; i++) {
          for(int j=0; j<cols; j++) {
            System.out.print("linea"+i+","+j+":"+info[i][j]+"\t"); 
          }
          System.out.println();
        }
        */
        this.linea=lineas;
        this.columnas=cols;
        L=new String[lineas][cols];
        L=info;
      } else {
        System.out.println("Vacio");
      }

      

    }


    public int getLineas() {
        return linea;
    }

    public void setLineas(int lineas) {
        this.linea = lineas;
    }

    public int getColumnas() {
        return columnas;
    }

    public void setColumnas(int columnas) {
        this.columnas = columnas;
    }

    public String[][] getL() {
        return L;
    }

    public void setL(String[][] L) {
        this.L = L;
    }

    
    
    
    
}
