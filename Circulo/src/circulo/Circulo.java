/*
  Rafael Zulzke do Nascimento RA 1581104850 
  Ledilene Piques             RA 1571201077
*/
package circulo;

public class Circulo 
{
   int raio;
   int x,y;
   Ponto p1;
  
     Circulo(Ponto p1, int raio)
      {
        this.raio = raio;
        this.p1 = p1;
      }
           
     Circulo(int x1, int y1, int raio) 
      {
         x = x1;
         y = y1;
         this.raio = raio;
      }

    double area()
    {
     return Math.PI*(raio*raio);
    }
    
    double circunferencia()
    {
     return 2*Math.PI*raio;
    }
   
    @Override    
    public String toString() 
    {
     return " Raio: " + raio + " Ponto: " + p1 + " Area: " + area()+ " Circuferencia: " + circunferencia();     
    }
}
