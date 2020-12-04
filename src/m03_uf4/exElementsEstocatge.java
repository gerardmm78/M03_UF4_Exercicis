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
public class exElementsEstocatge {

    public static void main (String[] args){
        Scanner key = new Scanner(System.in);
        
        System.out.println("Introdueix l'identificador del producte: ");
        String prodId = key.nextLine();
        System.out.println("Introdueix el nom del producte: ");
        String prodNom = key.nextLine();
        System.out.println("Introdueix el preu del producte: ");
        double prodPreu = key.nextDouble();
        
        ElementEstocatge ee1 = new ElementEstocatge(prodId, prodNom, prodPreu);
        ee1.incrementarEstoc(5);
        
        System.out.println("Estoc total: " + ee1.getEstocTotal());
        
        System.out.println("Preu total sense IVA: " + ee1.getPreuTotalSin());
        System.out.println("Preu total amb IVA: " + ee1.getPreuTotalCon());
        
    }
    
}

class ElementEstocatge {
    
    private String producteId;
    private String nom;
    private double preuUnitari;
    private int estocTotal;
    private double ivaAplicable = 11.99;

    public ElementEstocatge(String id, String nom, double preu) {
        this.producteId = id;
        this.nom = nom;
        this.preuUnitari = preu;
    }

    public void setPreuUnitari(double preuUnitari) {
        this.preuUnitari = preuUnitari;
    }

    public String getProducteId() {
        return this.producteId;
    }

    public String getNom() {
        return this.nom;
    }

    public double getPreuUnitari() {
        return this.preuUnitari;
    }

    public int getEstocTotal() {
        return this.estocTotal;
    }
    
    public double getPreuTotalSin(){
        return this.preuUnitari * estocTotal;
    }
    
    public double getPreuTotalCon(){
        return this.preuUnitari * estocTotal + ivaAplicable;
    }
    
    public int incrementarEstoc(int increment){
        return this.estocTotal += increment;
    }
    
    public double setIvaAplicable(double iva){
        return this.ivaAplicable = iva;
    }
    
    //Falta el punt 6
    
}
