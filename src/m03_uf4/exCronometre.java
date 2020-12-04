/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m03_uf4;
import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author GeriQuinzel
 */
public class exCronometre {
    
    public static void main (String[] args){
        Scanner key = new Scanner(System.in);
        Cronometre cron = new Cronometre();
        
        System.out.println("1.- Start");
        System.out.println("2.- Stop");
        System.out.println("3,- Mostrar");
        System.out.println("0.- Sortir");
        System.out.println();
        int opcio = key.nextInt();
        
        while (opcio != 0){
            
            switch (opcio){
                
                case 1:
                    cron.start();
                    System.out.println("Crono START!");
                    break;
                case 2:
                    cron.stop();
                    System.out.println("Crono STOP!");
                    break;
                case 3:
                    System.out.printf("Display: %.3f segons.%n", cron.getIntervalTemps() / 1000d);
                    break;
            }
            opcio = key.nextInt();
                
        }
        
        
            
    }

}


class Cronometre {
    
    public void start() {
        
        
        
    }
    
    public void stop() {
        
        
        
    }
    
    public long getIntervalTemps(){
        
        return System.currentTimeMillis();
        
    }
    
}
