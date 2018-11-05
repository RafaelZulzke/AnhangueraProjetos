public class UsaCalculo 
{
           
    public static void main(String args[])
    {
      CalculoBasico calc = new CalculoBasico(1, -2,-3);
      
      if(calc.vali())
      {
        System.out.println(calc.x);
        System.out.println(calc.y);
      }
      else
      {
          System.out.println("Operação Invalida");   
      }
      
    }
}
