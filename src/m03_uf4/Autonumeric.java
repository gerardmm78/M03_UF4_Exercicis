/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m03_uf4;

/**
 *
 * @author Usuario
 */
public class Autonumeric {
    
    
    
}

class AutoNumeric {
    
    private int id;
    private static int nextId = 1;
    
    public AutoNumeric(){
        id = nextId;
        nextId++;
    }
    
    public int getId() {
        return id;
    }
    
}