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
public class exComptadorMenu {
    
    public static void main (String[] args){
        Scanner key = new Scanner(System.in);
        ComptadorMenu compt = new ComptadorMenu();
        
        System.out.println("1.- Comptar");
        System.out.println("2.- Undo");
        System.out.println("3.- Mostrar");
        System.out.println("4.- Assignar límit");
        System.out.println("5.- Reset");
        System.out.println("0.- Sortir");
        System.out.println("");
        int opcio = key.nextInt();
        
        while (opcio != 0){
            
            switch (opcio){
                
                case 1:
                    compt.comptar();
                    break;
                case 2:
                    compt.undo();
                    break;
                case 3:
                    System.out.println(compt.getComptador());
                    break;
                case 4:
                    System.out.println("Número límit: ");
                    compt.setLimit(key.nextInt());
                    break;
                case 5:
                    compt.reset();
                    break;
                
            }
            
            opcio = key.nextInt();
            
        }
        
    }
    
}

class ComptadorMenu {
    
    private int valor = 0;
    private int limit = Integer.MAX_VALUE;
    IllegalArgumentException ex = new IllegalArgumentException();

    public ComptadorMenu() {
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
