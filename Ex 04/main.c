#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) {
	int a,b,c;
	printf("Digite o primeiro valor");
	scanf("%d", &a);
	printf("Digite o segundo valor");
	scanf("%d", &b);
	printf("Digite o terceiro valor");
	scanf("%d", &c);
 
    if(a<b)
	{
	 if(a<c)
	 {
	  if(b<c)
	  {
       printf("%d %d %d", a,b,c);	
	  }	
	  else
	  {
	   printf("%d %d %d",a,c,b);
	  }
	 }
	
	}
	
	if(b<a)
	{
	 if(b<c)
	 {
	  if(a<c)
	  {
       printf("%d %d %d",b,c,a);	
	  }	
	  else
	  {
	   printf("%d %d %d",b,a,c);
	  }
	 }
	
	}	
	
	if(c<a)
	{
	 if(c<b)
	 {
	  if(a<b)
	  {
       printf("%d %d %d",c,b,a);	
	  }	
	  else
	  {
	   printf("%d %d %d",c,a,b);	  
	  }
	 }
	
	}	
		
		

	
	system("pause");
	return 0;
}
