/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m03_uf4;

/**
 *
 * @author GeriQuinzel
 */
public class exSensor {
    
    public static void main (String[] args){
        
        Sensor s1 = new Sensor();
        
        System.out.println(s1.setPressio(5));
        System.out.println(s1.getpressio());
        
    }
    
}

class Sensor {
    
    double pressio;

    public Sensor() {
        
        pressio = 0;
        
    }
    
    public Sensor(double pressio) {
        this.pressio = pressio;
    }
    
    public boolean setPressio(double pressio){
        
        if (pressio <= 0){
            return false;
        } else {
            this.pressio = pressio;
            return true;
        }
        
    }
    
    public double getpressio(){
        return this.pressio;
    }
    
}
