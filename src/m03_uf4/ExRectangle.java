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
public class ExRectangle {
    
    public static void main (String[] args){
        
        Rectangle r1 = new Rectangle();
        
        r1.setAmplada(11.0);
        r1.setAlcada(20.0);
        
        System.out.println("Amplada: " + r1.getAmplada());
        System.out.println("Alçada: " + r1.getAlcada());
        System.out.println("Àrea: " + r1.getArea());
        System.out.println("Perímetre: " + r1.getPerimetre());
    }
    
    
}

class Rectangle {
    
    private double amplada;
    private double alcada;
    
    public Rectangle(){
        
    }

    public Rectangle(double amplada, double alcada) {
        this.amplada = amplada;
        this.alcada = alcada;
    }

    public double getAmplada() {
        return this.amplada;
    }

    public void setAmplada(double amplada) {
        if (amplada < 1.0) this.amplada = 1.0;
        else this.amplada = amplada;
    }

    public double getAlcada() {
        return this.alcada;
    }

    public void setAlcada(double alcada) {
        if (alcada < 1.0) this.alcada = 1.0;
        else this.alcada = alcada;
    }
    
    public double getArea(){
        
        return amplada * alcada;
        
    }
    
    public double getPerimetre(){
        
        return (amplada * 2) + (alcada * 2);
        
    }
    
    public static Rectangle getMaxAreaRectangle(Rectangle[] rectangles){
        
        if (rectangles != null && rectangles.length > 0){
            Rectangle result = rectangles[0];
            
            for (Rectangle r : rectangles) {
                if (result.getArea() < r.getArea()) {
                    result = r;
                }
            }
            return result;
        } else {
            return null;
        }
        
    }
    
}
