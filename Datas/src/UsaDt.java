public class UsaDt 
{
    public static void main(String args[])
    {
      Dt d1 = new Dt(20, 7, 2013);
      Dt d2 = new Dt(20, 7);
      
        System.out.println(d1);
        
        if(d1.vemAntes(d2))
        {
         System.out.println(d1.d + "/" + d1.m + "/" + d1.a + " Vem Antes de " + d2.d + "/"+ d2.m + "/" + d2.a);    
        }
        else if(d2.vemAntes(d1))
        {
            System.out.println(d2.d + "/" + d2.m + "/" + d2.a + " Vem Antes de " + d1.d + "/"+ d1.m + "/" + d1.a);   
        }
        else
        {
            System.out.println(d1.mostraDt()+ " Vem Depois de " + d2.mostraDt());
        }
        
    }
}
    

