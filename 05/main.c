#include <stdio.h>
#include <stdlib.h>

int main(int argc, char *argv[])
{
  int a[6],i,soma=0;
  float media; 
     
  for (i=0; i<=5 ;i++)
  {
  printf("Digite o %d numero do vetor\n\n",i+1);
  scanf("%d",&a[i]);
  soma = soma + a[i];
  } 
  
  media = soma/6; 
  
  printf("\n\nO primeiro numero do vetor é %d\n\n", a[0]);
  printf("\n\nO segundo numero do vetor é %d\n\n", a[5]);
  
  printf("\n\nA soma dos numeros é %d\n\n",soma);
  printf("\n\nA media dos numeros é %.2f\n\n", media);
  

  
  system("PAUSE");	
  return 0;
}
