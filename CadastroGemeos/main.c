#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

 main() {
	
	int escolha, i, v=0;
	char login[40], senha[9], login1[40], senha1[9];
	
	while(1){

	printf("1 - Cadastro \n2 - Entrar no Sistema \n3 - Sair");
	printf("\nDigite a opcao desejada: ");
	scanf("%d", &escolha);
	
	switch (escolha) {

	case 1:
	{	
	system("cls");
		printf("Cadastro \n");
		
		printf("\nLogin: ");
		scanf("%s", &login);
		
		printf("\n(Obrigatoria ter 7 digitos) \nSenha: ");
			for(i=0; i<=8; i++)
			{
				senha[i]=getch();
				printf("*");
			}		
		system("cls");
		break;
	}

	case 2:
	{	
		system("cls");
		printf("Entrar no Sistema \n");
		
		do{	
		system("cls");
		v++;
		printf("Tentativa %d de 3 \n", v);
		printf("\nLogin: :");
		scanf("%s", &login1);
		
		printf("\nSenha: ");
			for(i=0; i<=8; i++)
			{
				senha1[i]=getch();
				printf("*");
			}		
		if((strcmp(login,login1)==0)&&(strcmp(senha,senha1)==0)){
			printf("\nEntrando..."); 
			exit(0);
			}
				else
			{
				printf("\nTente novamente!");
				system("cls");
			}
		}while(v!=3);
		exit(0);                                                                                              
	}
	
		case 3:
	{	
		exit(0);
	}
	}

//	return 0;
}
}
