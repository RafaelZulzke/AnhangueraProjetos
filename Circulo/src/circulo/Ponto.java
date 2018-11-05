/*
  Rafael Zulzke do Nascimento RA 1581104850 
  Ledilene Piques             RA 1571201077
*/
package circulo;

public class Ponto 
{
    int x;
    int y;

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
    
     Ponto(int x, int y) 
    {
        this.x = x;
        this.y = y;
    }
    
    @Override    
    public String toString() 
    {
     return " X: " + x + " Y: " + y;
    }
    
}
