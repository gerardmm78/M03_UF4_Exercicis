
package proves;

public class Solitari {
    
    private static Solitari innerSolitari = null;
    
    private Solitari(){
    }
    
    public static Solitari crearSolitari() {
        if (innerSolitari == null) {
            innerSolitari = new Solitari();
        }
        return innerSolitari;
    }
    
}
