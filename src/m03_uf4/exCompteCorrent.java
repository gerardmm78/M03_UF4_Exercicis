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
public class exCompteCorrent {
    
    public static void main (String[] args){
        
        CompteCorrent cc1 = new CompteCorrent(50);
        
        System.out.println(cc1.getDiposit());
        cc1.incDiposit(25);
        System.out.println(cc1.getDiposit());
        cc1.decDiposit(100);
        System.out.println(cc1.getDiposit());
        
        
    }
    
}

class CompteCorrent {
    
    private double diposit;
    IllegalArgumentException ex = new IllegalArgumentException();

    public CompteCorrent(double dipositInicial) {
        
        if (dipositInicial < 0){
            throw ex;
        } else {
            this.diposit = dipositInicial;
        }
    }
    
    public void incDiposit(double credit){
        this.diposit += credit;
    }
    
    public void decDiposit(double debit){
        
        if (debit > diposit){
            System.out.println("Quantitat de fons insuficient!");
        } else {
            this.diposit -= debit;
        }
    }

    public double getDiposit() {
        return diposit;
    }
    
    
    
}