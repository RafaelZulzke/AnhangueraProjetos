#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) 
{
 float salario, prestacao, percentual;

  printf("Informe o salario: R$ ");
  scanf("%f", &salario);
  printf("Informe o valor da prestacao: R$ ");
  scanf("%f", &prestacao);

  percentual = (prestacao / salario) * 100;

  printf("\nA prestacao corresponde a %.2f do salario.", percentual);

  if (percentual > 20.0)
  {
    printf("\nEmprestimo nao pode ser concedido.");
  }
  if(percentual < 20.0)
  {
    printf("\nEmprestimo pode ser concedido.");
  }
  
	return 0;
	system("pause");
}
