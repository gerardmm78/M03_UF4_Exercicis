package m03_uf4;


import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author GeriQuinzel
 */
public class exVector {
    
    public static void main (String[] args){
        
        VectorOrdenat vo = new VectorOrdenat();
        
        vo.insereix(10);
        System.out.println("insereix(10): " + vo);
        vo.insereix(13);
        System.out.println("insereix(13): " + vo);
        vo.insereix(2);
        System.out.println("insereix(2): " + vo);
        vo.insereix(11);
        System.out.println("insereix(11): " + vo);
        
        vo.insereix(new double[]{3, 10, 5, 9, 23, 1});
        System.out.println("insereix(new double[]{3,10,5,9,23,1}): " + vo);
        vo.insereix(new double[]{2, 7, 11});
        System.out.println("insereix(new double[]{2, 7, 11}): " + vo);
        
        System.out.println("El número 11 està en la posició " + vo.cerca(11));
        
        vo.elimina(11);
        System.out.println("elimina (11): " + vo);
        
    }
    
}

class VectorOrdenat {
    
    private double[] vector;

    public VectorOrdenat() {
        this.vector = new double[0];
    }

    public void insereix (double n){
        
        boolean canvi = false;
        
        if (vector.length == 0){
            this.vector = new double[1];
            vector[0] = n;
        } else {
            
            double[] nouVector = new double[this.getMida()+1];
            int j = 0;

            for (int i = 0; i < vector.length; i++){
                
                if (vector[i] > n && canvi == false){
                    
                    nouVector[j] = n;
                    j++;
                    nouVector[j] = vector[i];
                    canvi = true;
                    
                }
                
                else {
                    
                    nouVector[j] = vector[i];
                    
                }
                
                j++;
                
                if (i == (vector.length - 1) && canvi == false){
                    nouVector[j] = n;
                }
                
            }
            
            vector = nouVector;
            
        }
    }
    
    public void insereix (double[] vector){
        
        Arrays.sort(vector);
        
        if (this.getMida() == 0){
            double[] nouVector = new double[vector.length];
            System.arraycopy(vector, 0, nouVector, 0, nouVector.length);
            
            this.vector = nouVector;
            
        } else {
            
            double[] nouVector = new double[(this.getMida() + vector.length)];
            
            System.arraycopy(this.vector, 0, nouVector, 0, this.getMida());
            
            int j = 0;
            
            for (int i = this.getMida(); i < nouVector.length; i++){
                nouVector[i] = vector[j];
                j++;
            }
            
            Arrays.sort(nouVector);
            this.vector = nouVector;
            
        }
        
    }
    
    public void elimina (double n){
        
        IllegalArgumentException ex = new IllegalArgumentException();
        double[] nouVector = new double[this.getMida()-1];
        
        boolean canvi = false;
        int j = 0;
        
        for (int i = 0; i < nouVector.length; i++){
            
            if (this.vector[j] == n && canvi == false){
                j++;
                canvi = true;
                nouVector[i] = this.vector[j];
            } else {
                nouVector[i] = this.vector[j];
            }
            
            j++;
            
        }
        
        if (canvi == false){
            throw ex;
        }
        
        this.vector = nouVector;
        
    }
    
    public int cerca (double n){
        
        int pos = 0;
        
        for (int i = 0; i < this.getMida(); i++){
            
            if (vector[i] == n){
                pos = i;
                i = this.getMida();
                
            } else {
                
                pos = -1;
                
            }
            
        }
        
        return pos;
        
    }
    
    public VectorOrdenat crearVectorOrdenat (double[] v){
        
        VectorOrdenat vo = new VectorOrdenat();
        vo.insereix(v);
        
        return vo;
        
    }
    
    
    public int getMida(){
        return vector.length;
    }
    
    public double[] getVector(){
        return this.vector;
    }
    
    /* //No se molt bé que demana aquest mètode
    public double getIndex(int index){
        
        
        
    }
    */

    @Override
    public String toString() {
        return "VectorOrdenat{" + "vector=" + Arrays.toString(vector) + '}';
    }
    
    
}
