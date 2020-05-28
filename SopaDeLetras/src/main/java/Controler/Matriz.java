/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controler;

import java.util.Random;
import objects.Celdas;

/**
 *
 * @author Maryt
 */
public class Matriz {
    private int n;
    private int m;
    private int numP;
    private String[] palabras;
    private Celdas[][] celdas; 
    
    Matriz(int n, int m,int numP,String[] palabras){
    this.n=n;
    this.m=m;
    this.numP=numP;
    this.palabras=palabras;
        System.out.println(n);
        System.out.println(m);
    System.out.println(numP);
    
    crearMatriz();
    
    }
    
    
    public Celdas[][] crearMatriz(){
    celdas= new Celdas[m][n];
    
        for (int i = 0; i < m; i++) {
               for (int j = 0; j < n; j++) {
                 celdas[i][j]=new Celdas();
               }
           }
    
     randomPosicion();
     
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                
                System.out.print(celdas[i][j].getLetra()+"\t");
            }
            System.out.println("");
        }
             
        return celdas;
    }
    
    
    public void randomPosicion(){
        
        int N;
        int M;
            
            for (int j = 0; j < numP; j++) {
                
                random(palabras[j]);
            
            }
            
            
            
    
    }
    
    
            public void random(String palabra){
                int N;
                int M;
            
                
                orientación O=randomO();
                int x=palabra.length();
               
                int t;
                
                switch (O){
                    
                    case H:
                      t=m-x; 
                      M=(int)(Math.random()*t);
                      N = (int)(Math.random()*n);
                      System.out.println("Yo envio palabra: "+palabra+" m:"+M+" n:"+N);
                      
                      posicionarV(N,M,palabra);
                      break;
                      
                    case V:
                      t=n-x; 
                      N=(int)(Math.random()*t);
                      M = (int)(Math.random()*m);
                       System.out.println("Yo envio palabra: "+palabra+" m:"+M+" n:"+N);
                      posicionarH(N,M,palabra);
                      break;
                        
                    case D:
                      t=m-x; 
                      M=(int)(Math.random()*t);
                      t=n-x;  
                      N=(int)(Math.random()*t);
                       System.out.println("Yo envio palabra: "+palabra+" m:"+M+" n:"+N);
                      posicionarD(N,M,palabra);
                      
                      break;
                     
            
                    }
            }
/*
    public void posicionarH(int N,int M,String Palabra){
    
        char[] Letra = Palabra.toCharArray();
        int t;
        int c=N;
        int f=M;
        
        for(int i=0;i<Palabra.length();i++)
        { 
            System.out.println("H:"+M+","+N+","+i);
            
            if(celdas[M][N].getEstado()!=0){
                
                int h=1;//mientras no tetrmine con todas las letras
                
                while(h==1){
                        t=n-Palabra.length(); 
                        c=(int)(Math.random()*t);  
                        f=(int)(Math.random()*m);
                        
                        N=c;
                        M=f;
                        System.out.println("while:"+N+","+M);
                        for(int z=0;z<Palabra.length();z++){
                            
                            if(celdas[N][M].getEstado()!=0){
                                z=Palabra.length()-1;
                            }else{
                                if(z==Palabra.length()-1){
                                h=0;
                                }
                                N++;
                            }
                        }
                }
                
            }else{
                N++;
                System.out.println("N:"+N+" M:"+M);
            }
        }
            for (int j = 0; j < Palabra.length(); j++) {
                    celdas[f][c].setLetra(Letra[j]);
                    celdas[f][c].setEstado(1);
                c++;
            }
    }
    public void posicionarV(int N,int M,String Palabra){
    
        char[] Letra = Palabra.toCharArray();
        int t;
        int c=N;
        int f=M;
        
        for(int i=0;i<Palabra.length();i++)
        { 
            System.out.println("V:"+M+","+N+","+i);
            if(celdas[M][N].getEstado()!=0){
                
                int h=1;//mientras no tetrmine con todas las letras
                
                while(h==1){
                        t=m-Palabra.length(); 
                        f=(int)(Math.random()*t);  
                        c=(int)(Math.random()*n);
                        
                        N=c;
                        M=f;
                       System.out.println("while:"+N+","+M); 
                        for(int z=0;z<Palabra.length();z++){
                            
                            if(celdas[N][M].getEstado()!=0){
                                z=Palabra.length()-1;
                            }else{
                                
                                if(z==Palabra.length()-1){
                                h=0;
                                }
                                M++;
                            }
                        }
                }
                
            }else{
            M++;
            }
        }
            for (int j = 0; j < Palabra.length(); j++) {
                     celdas[f][c].setLetra(Letra[j]);
                    celdas[f][c].setEstado(1);
                f++;
            }
    }
*/
    
public void posicionarD(int N,int M,String Palabra){
    
        char[] Letra = Palabra.toCharArray();
        int t;
        int c=N;
        int f=M;
        int a=1;
        
        int veces=0;
            while(a==1){
                
                for(int i=0;i<Palabra.length();i++){
                    
                    if(celdas[M][N].getEstado()==0){
                    System.out.println(Palabra+"D:"+M+","+N+","+i);
                        M++;
                        N++;
                    
                    }else{
                        veces++;
                        i=-1;
                        
                        t=n-Palabra.length(); 
                        c=(int)(Math.random()*t);
                        t=m-Palabra.length();
                        f=(int)(Math.random()*t);
                        
                        N=c;
                        M=f;
                    }
                    
                    if((i==Palabra.length()-1)||(veces==30)){
                    a=0;
                    }
                }    
            }
            if(veces==30){
                random(Palabra);
            }else{
                for (int j = 0; j < Palabra.length(); j++) {
                            celdas[f][c].setLetra(Letra[j]);
                            celdas[f][c].setEstado(1);
                        c++;
                        f++;
                }
            }
}

public void posicionarH(int N,int M,String Palabra){
    
        char[] Letra = Palabra.toCharArray();
        int t;
        int c=N;
        int f=M;
        int a=1;
        
        int veces=0;
            while(a==1){
                
                for(int i=0;i<Palabra.length();i++){
                    
                    if(celdas[M][N].getEstado()==0){
                    System.out.println(Palabra+"D:"+M+","+N+","+i);
                        
                        N++;
                    
                    }else{
                        veces++;
                        i=-1;
                        
                        t=n-Palabra.length(); 
                        c=(int)(Math.random()*t);
                        f=(int)(Math.random()*m);
                        
                        N=c;
                        M=f;
                    }
                    
                    if((i==Palabra.length()-1)||(veces==30)){
                    a=0;
                    }
                }    
            }
            if(veces==30){
                random(Palabra);
            }else{
                for (int j = 0; j < Palabra.length(); j++) {
                            celdas[f][c].setLetra(Letra[j]);
                            celdas[f][c].setEstado(1);
                        c++;
                }
            }
}

public void posicionarV(int N,int M,String Palabra){
    
        char[] Letra = Palabra.toCharArray();
        int t;
        int c=N;
        int f=M;
        int a=1;
        
        int veces=0;
            while(a==1){
                
                for(int i=0;i<Palabra.length();i++){
                    
                    if(celdas[M][N].getEstado()==0){
                    System.out.println(Palabra+"D:"+M+","+N+","+i);
                        M++;
                    
                    }else{
                        veces++;
                        i=-1;
                        
                        t=m-Palabra.length(); 
                        f=(int)(Math.random()*t);
                        c=(int)(Math.random()*n);
                        
                        N=c;
                        M=f;
                    }
                    
                    if((i==Palabra.length()-1)||(veces==30)){
                    a=0;
                    }
                }    
            }
            if(veces==30){
                random(Palabra);
            }else{
                for (int j = 0; j < Palabra.length(); j++) {
                            celdas[f][c].setLetra(Letra[j]);
                            celdas[f][c].setEstado(1);
                        
                        f++;
                }
            }
}/*
public void posicionarV(int N,int M,String Palabra){
    
        char[] Letra = Palabra.toCharArray();
        int t;
        int c=N;
        int f=M;
        int a=1;
        
            while(a==1){
                for(int i=0;i<Palabra.length();i++){
                    if(celdas[M][N].getEstado()==0){
                        System.out.println(Palabra+"V:"+M+","+N+","+i);
                        M++;
                        
                    }else{
                        i=-1;
                        
                        
                        c=(int)(Math.random()*n);
                        t=m-Palabra.length();
                        f=(int)(Math.random()*t);
                        
                        N=c;
                        M=f;
                    }
                    
                    
                    if(i==Palabra.length()-1){
                    a=0;
                    }
                }    
            }
            for (int j = 0; j < Palabra.length(); j++) {
                    celdas[f][c].setLetra(Letra[j]);
                    celdas[f][c].setEstado(1);
                
                f++;
            }
    } 
public void posicionarH(int N,int M,String Palabra){
    
        char[] Letra = Palabra.toCharArray();
        int t;
        int c=N;
        int f=M;
        int a=1;
        
            while(a==1){
                for(int i=0;i<Palabra.length();i++){
                    if(celdas[M][N].getEstado()==0){
                        System.out.println(Palabra+"H:"+M+","+N+","+i);
                        N++;
                    }else{
                        i=-1;
                        
                        
                        f=(int)(Math.random()*f);
                        t=n-Palabra.length();
                        c=(int)(Math.random()*t);
                        
                        N=c;
                        M=f;
                    }
                    
                    
                    if(i==Palabra.length()-1){
                    a=0;
                    }
                }    
            }
            for (int j = 0; j < Palabra.length(); j++) {
                    celdas[f][c].setLetra(Letra[j]);
                    celdas[f][c].setEstado(1);
                
                c++;
            }
    } 
*/
  
    
    public void verM(){
        System.out.println("verM");
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                
                System.out.print(celdas[i][j].getLetra()+"\t");
            }
            System.out.println("");
        }
        
    }
    
     
    
    
    private orientación randomO() {
    int pick = new Random().nextInt(orientación.values().length);
    return orientación.values()[pick];
    }
}
