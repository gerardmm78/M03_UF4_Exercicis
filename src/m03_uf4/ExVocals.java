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
public class ExVocals {
    
    public static void main (String[] args){
        //Scanner key = new Scanner(System.in, "Windows-1252"); //No em funciona el tema dels accents
        Scanner key = new Scanner(System.in);
        VocalsFugides vf = new VocalsFugides("Hola, com estas?");
        String type;
        
        do {
            
            System.out.println("Escriu '.' per acabar o completa amb les vocals que manquen: ");
            System.out.println(vf.getEnunciat());
            type = key.nextLine();
            vf.comprovarSolucio(type);
            
            if (vf.comprovarSolucio(type) == true){
                System.out.println("Molt bé! Has encertat!\nAdéu");
                type = ".";
            } else {
                
                if (".".equals(type)) System.out.println("Adéu!");
                else System.out.println("No... no és aquesta la solució...");
            }
            
        } while (!".".equals(type));
        
        
        
    }
    
}

class VocalsFugides {
    
    private final String solucio;

    public VocalsFugides(String solucio) {
        this.solucio = solucio;
    }
    
    public String getEnunciat(){
        return this.extreuVocals(solucio);
    }
    
    public boolean comprovarSolucio(String possibleSolucio){
        return possibleSolucio.equals(solucio);
    }
    
    private String extreuVocals(String s){
        
        String split = s.replaceAll("([aeiou])", "");
        
        return split;
        
    }
    
    private boolean esVocal(char c){
        
        char vocals[] = {'a', 'e', 'i', 'o', 'u'};
        boolean canvi = false;
        
        for (int i = 0; i < vocals.length; i++){
            
            if (vocals[i] == c) canvi = true;
            
        }
        
        return canvi;
        
    }
    
}
