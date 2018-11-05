/*
  Rafael Zulzke do Nascimento RA 1581104850 
  Ledilene Piques             RA 1571201077
*/
package circulo; 

public class RetornoInfo 
{     
    
     public static void main(String[]args)
    {
            
    Ponto p1 = new Ponto(2,5);     
    Circulo c1 = new Circulo(p1,4);
    Circulo c2 = new Circulo(new Ponto(1,2),5);
    Circulo c3 = new Circulo(3,4,5);
    Circulo c4 = new Circulo(1,1,6);
    Circulo c5 = new Circulo(5,5,6);
    
    System.out.println(p1);
    System.out.println(c1);
    System.out.println(c2);
    System.out.println(c3);
    System.out.println(c4);
    System.out.println(c5);
   
    
    }
    
}
