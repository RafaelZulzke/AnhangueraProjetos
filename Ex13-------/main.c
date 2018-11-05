#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[])
{
    float media,p1,p2,p3, exame,final;
    printf("Digite Nota da Primeira Prova");
    scanf("%f", &p1);
    printf("Digite Nota da Segunda Prova");
    scanf("%f", &p2);
    printf("Digite Nota da Terceira Prova");
    scanf("%f", &p3);
    
    media = (p1+p2+p3)/3;
    
    if (media >= 7)
    {
    printf("Aluno Aprovado sem pendecias"); 
	}
	
	else
	{
	 printf("Digite a nota do Exame");
	 scanf("%f", &exame);
	 final = (media + exame ) /2;
	 if (final >= 5)
	 {
	 printf("Aluno Aprovado");
	 }
	 else
	 {
	printf("Aluno Reprovado");
	 }
	 	
	}

	return 0;
}
