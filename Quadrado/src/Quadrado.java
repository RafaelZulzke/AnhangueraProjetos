
public class Quadrado {
   double lado;

    public Quadrado(double lado) 
    {
       this.lado = lado;
    }

   double area()
   {    
    return lado*lado;
   }
   
   double perimetro()
   {
    return lado+lado+lado+lado;
   }
    
}
