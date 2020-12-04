/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m03_uf4;
import java.util.Scanner;

/**
 *
 * @author GeriQuinzel
 */
public class exComptador {
    
    public static void main (String[] args){
        Comptador compt = new Comptador();
        
        compt.setLimit(5);
        compt.reset();
        compt.comptar();
        compt.comptar();
        compt.undo();
        compt.comptar();
        compt.comptar();
        System.out.println(compt.getComptador());
        compt.comptar();
        compt.comptar();
        System.out.println(compt.getComptador());
        compt.comptar();
        
    }
    
}

class Comptador {
    
    private int valor = 0;
    private int limit = Integer.MAX_VALUE;
    IllegalArgumentException ex = new IllegalArgumentException();

    public Comptador() {
    }
    
    public void comptar(){
        
        valor++;
        
        if (valor > limit){
            throw ex;
        }
        
    }
    
    public void reset(){
        
        valor = 0;
        
    }
    
    public void undo(){
        
        if (valor == 0){
            System.out.println("No es pot retrocedir més");
        } else {
            valor--;
        }
        
    }
    
    public int getComptador(){
        return this.valor;
    }
    
    public void setLimit(int limit){
        this.limit = limit;
    }
    
}
