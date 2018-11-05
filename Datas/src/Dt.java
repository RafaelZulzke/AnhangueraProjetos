public class Dt 
{
    int d; 
    int m; 
    int a;

        Dt(int d, int m, int a)
        {
        this.d = d;
        this.m = m;
        this.a = a;
        }
        
        Dt(int d, int m)
        {
        this.d = d;
        this.m = m;
        this.a = 2013;
        }

    boolean vemAntes(Dt data)
    {
        if(a < data.a)
        {
         return true;   
        }
        else if( a > data.a)
                {
                 return false;   
                }
           else 
             if( m < data.m)
                   {
                   return true;
                   }
                   else if( m > data.m)
                   {
                    return false;
                   }
                       else
                        if(d < data.d)
                         {
                          return true;
                         }
                         else if (d > data.d)
                         {
                          return false;   
                         }
             return true;           
         }
    
    public String mostraDt()
    {
     return d + "/" + m + "/" + a;
    }
    
}

