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
public class exIncubadora {
    
    public static void main (String[] args){
        Scanner key = new Scanner(System.in);
        Incubadora incubadora = new Incubadora();
        int opcio;
        
        System.out.println("1.- Incrementar temperatura");
        System.out.println("2.- Decrementar temperatura");
        System.out.println("3.- Mostrar temperatura");
        System.out.println("0.- Sortir");
        System.out.println("");
        opcio = key.nextInt();
        
        while (opcio != 0){
            
            switch (opcio){
                
                case 1:
                    incubadora.incTemperatura();
                    break;
                case 2:
                    incubadora.decTemperatura();
                    break;
                case 3:
                    System.out.println(incubadora.getTemperatura());
                
            }
            
            opcio = key.nextInt();
            
        }
        
    }
    
}

class Incubadora {
    
    private int temperatura = 5;
    private int MAX;
    private int MIN;

    public Incubadora() {
    }

    public String getTemperatura() {
        return String.format("La temperatura actual és de %dº.", this.temperatura);
    }
    
    public boolean incTemperatura(){
        this.temperatura++;
        
        if (temperatura < -10 || temperatura > 10){
            System.out.println("ALARMA! Temperatura massa alta");
            return false;
        }
        else {
            return true;
        }
        
    }
    
    public boolean decTemperatura(){
        this.temperatura--;
        
        if (temperatura < -10 || temperatura > 10){
            System.out.println("ALARMA! Temperatura massa baixa");
            return false;
        }
        else {
            return true;
        }
        
    }
    
}
