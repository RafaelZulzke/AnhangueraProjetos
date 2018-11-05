#include <stdio.h>
#include <stdlib.h>

int main(int argc, char *argv[])
{
   
   int idade,i=0,som, menor, maior;
   float med ; 
  do
  {
  printf("\n\nDigite a idade\n\n");
  scanf("%d", &idade);
  som = som+idade;
  if(idade !=0)
  i++;
  
  if(idade >= maior)
  {
   maior = idade;
  }
  
  else{
		  	if (idade <= menor)
		  	{
		  	 menor = idade;
		  	}
		}


  }while(idade != 0);
  
  med = som/i;
    
  printf("\n\nIdades Digitadas %d\n\n",i);
  printf("\n\nA media das idades é %.2f\n\n", med);
  printf("\n\nO maior numero é %d\n\n", maior); 
  printf("\n\nO menor numero é %d\n\n", menor);
  
  system("PAUSE");	
  return 0;
}
