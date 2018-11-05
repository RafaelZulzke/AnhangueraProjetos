#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[])
 {
	int a ,b,c,d;
	printf("Digite o valor superior");
	scanf("%d", &a);
	printf("Digite o valor inferior");
	scanf("%d", &b);

    for(c = a; c < b; c++)
    {
    if (a >= b)
      {
       d = d + c;	
      }
	}
	printf("%d", d);
	return 0;   
}
