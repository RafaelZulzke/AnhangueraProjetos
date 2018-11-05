#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <conio.h>


/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) 
{
	int a,b,i,j;
	int op=1;
	char login[7],senha[6], login1[7], senha1[6];
	do
	{
		printf("\n\n1 - Cadastrar\n\n");
		printf("\n\n2 - Logar\n\n");
		printf("\n\n3 - Fechar\n\n");
		scanf("%d",&op);	
		
		switch(op)
		{
			
			case 1:
				system("cls");
				printf("\n\n\nDigite o Login\n\n\n");
				scanf("%s",&login); 
			 	printf("\n\n\nDigite a Senha\n\n\n");
				scanf("%s",&senha)
				
				/*
				for(i=0; i<=5; i++)
				{
				senha[i]=getch();
				printf("*");
				}		
				*/
				
						
				break;
			
			case 2:
				
	
				
				for(a=0;a<3;a++)
				{
				system("cls");	
				printf("\n\n\nTentativa %d de 3\n\n\n",a+1);
				printf("\n\n\nLogin:\n\n\n");
				scanf("%s",&login1);
				printf("\n\n\nSenha:\n\n\n");	
				scanf("%s",&senha1);
				
				/*
					for(j=0; j<=5; j++)
						{
							senha1[j]=getch();
							printf("*");
						}
				*/
									
					if((strcmp(login,login1)==0) && (strcmp(senha,senha1)==0))
						{
						system("cls");		
						printf("\n\n\nLogado com sucesso\n\n\n");	
						break;
						}
						else
						{
						printf("\n\n\nTente novamente!\n\n\n");
							if(a==3)
							{
							system("exit");
							}
						}
					    	
				}				
				break;
			
			
			case 3:
				system("cls");	
				printf("Deseja sair do programa \n\n 1 - Sim \n\n 2 - Nao \n\n");
				scanf("%d",&b);
				if(b==1)
				{
				system("cls");	
				return 0;
				}
				else
				{
				system("cls");	
				system("exit");	
				}
				break;
				
            default:
            	system("cls");	
            	printf("\n\n\nOpção Invalida\n\n\n");
            	break;

			
		}
	}while(op!=3);
	return 0;
}
