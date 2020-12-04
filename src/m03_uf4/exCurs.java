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
public class exCurs {
    
    public static void main (String[] args){
        
        Curs c1 = new Curs();
        c1.setNomCurs("M03 Programació");
        c1.setNomProfessor("Josep Queralt");
        
        System.out.println(c1.formatCadena());
    }
    
}

class Curs {
    
    private String nomCurs;
    private String nomProfessor;
    
    public Curs() {
        
    }

    public Curs(String nomCurs, String nomProfessor) {
        this.nomCurs = nomCurs;
        this.nomProfessor = nomProfessor;
    }

    public String getNomCurs() {
        return this.nomCurs;
    }

    public void setNomCurs(String nomCurs) {
        this.nomCurs = nomCurs;
    }

    public String getNomProfessor() {
        return this.nomProfessor;
    }

    public void setNomProfessor(String nomProfessor) {
        this.nomProfessor = nomProfessor;
    }
    
    public String formatCadena(){
        
        return String.format("%s impartit per %s", this.getNomCurs(), this.getNomProfessor());
        
    }
    
}
