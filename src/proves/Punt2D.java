
package proves;

public class Punt2D {
    
    private int x;
    private int y;
    
    public boolean Equals (Object o){
        
        if (o == null) return false;
        if (o.getClass() != this.getClass()) return false;
        
        Punt2D p = (Punt2D) o;
        return p.getX() == this.getX() && p.getY() == this.getY();
        
        
        
    }

    public Punt2D(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public int hashCode(){
        return x+y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    
    
}
