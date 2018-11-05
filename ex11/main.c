#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[])
{
	int a,b;
	printf("Digite o 1 numero \n\n");
	scanf("%i", &a);
      for(b = a;b!= 0 ;b--)
	 {
      		if((b%10)==0)
			{
			   printf ("E Divisivel por 10 \n\n");	
			}
			
            	if((b%5)==0)
          		{
				  printf ("E Divisivel por  5 \n\n");
				}
					if((b%2)==0)
          			{
				  		printf ("E Divisivel por  2 \n\n");
		     		}
		     	
		    if((b%10) != 0)
		    {
		     printf("Numero nao e divisivel por 10\n\n");
		     	if ((b% 5) != 0)
		     	{
		      	  printf("Numero nao divisivel por 5\n\n");	
		     	}
		     		if((b%2) != 0)
		     		{
		     	      printf("Numero nao divisivel por 2 \n\n");
		     		}
			 break;	
		    }
		    break;
     }
	
	return 0;
}
