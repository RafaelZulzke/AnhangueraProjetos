#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[])
{
	int dn, at, i;
	printf("\n\nDigite o ano do Nascimento\n");
	scanf("%d", &dn);
	printf("\n\nDigite o ano atual");
	scanf("%d", &at);
	
	i = at-dn;
	
	if (i >= 16)
	{
	printf("Voce tem idade para votar\n\n");
	  if (i >= 18)
	  {
	  printf("Voce tem idade para tirar carteira\n\n");
      }	
	}
	else
	{
	 printf("Voce nao tem idade para nada\n\n");
	}
	return 0;
}
