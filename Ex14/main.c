#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[])
{
	float ca,cb;
    int q;
    printf("Digite a quantidade de Livros");
    scanf("%d", &q);
    ca= (q*0.25)+7.50;
    cb = (q*0.50)+2.50;
    if(ca > cb)
    {
    printf("Utilize o criterio A");	
	}
	else
	{
	
	if(ca == cb)
	{
	printf("Os descontos são iguais");	
	}
    printf("Utilize o criterio B");
	}
	return 0;
}
