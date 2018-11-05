
public class CalculoBasico 
{

    double a;
    double b;
    double c;
    double x;
    double y;


    public CalculoBasico(double a, double b, double c) 
    {
        this.a = a;
        this.b = b;
        this.c = c;
        baskar();
    }

    public void baskar()
    {
       x = ( (-1*b) + Math.sqrt(del())) / (2*a);
       y = ( (-1*b) - Math.sqrt(del())) / (2*a);
    }
    public double del() 
    {
       return (b * b) - (4 * a * c);
    }

    public boolean vali()
    {
     if(del() >= 0)
     {
         return true;   
     }
     else
     {
         return false;   
     }
    }
}
