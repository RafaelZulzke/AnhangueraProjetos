#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

int op;
float a,b,c,d,e,f;
char nome[15], ra[8],r;

		void CadastroAlunos(char nome, char ra)
		{
			FILE*arquivo;
			
			arquivo = fopen("BD.txt","w");
			
				if(arquivo == NULL)
				{
				printf("Erro de Abertura");	
				return 1;
				}
					while(!feof(arquivo))
					{
					printf("\n\nDigite o Nome do Aluno\n\n");
					scanf("%s", &nome);
					printf("\n\nDigite o Ra do Aluno\n\n");
				   	scanf("%s", &ra);
				   	 
					 fprintf(arquivo,"%s");
					 fprintf(arquivo,"%s");
						
						system("cls");	
						printf("\n\n\nDeseja inserir outro aluno? \n\n");
						{
						r = getche();
						return 1;
						}while(r != 'n'); 
				   }
					
			fclose(arquivo);		
		}

			float EntradaMedia()
			{
				
				FILE*arquivo;
				
				char * result;
					
				arquivo=fopen("BD.txt","r");
					
				
						if(arquivo == NULL)
						{
						printf("Erro de Abertura");	
					    return 1;
						}
			
				printf("\n\nDigite o Nome do Aluno\n\n");
				fscanf(arquivo,"%s", &nome);
				printf("\n\nDigite o Ra do Aluno\n\n");
				fscanf(arquivo, "%s",&ra);
				
					while(!feof(arquivo))
					{
						result = fgets(nome,20,arquivo);
						
							if(result == nome && ra)
							{
							    printf("\n\nNome %d\n\n RA %d", nome,ra);	
									do
									{
									printf("\n\nDigite a Primeira Nota\n\n");
									scanf("%f", &a);
									printf("\n\nDigite a Segunda Nota\n\n");
									scanf("%f", &b);
									printf("\n\nDigite a Terceira Nota\n\n");
									scanf("%f", &c);
									system("cls");	
									printf("\n\n\nDeseja inserir outra nota? \n\n");
									r = getche();
									}while(r != 'n');
							}
					e++;
					}
				fclose(arquivo);	
			}

int main(int argc, char *argv[]) 
{
	FILE*arquivo;
	
	setlocale(LC_ALL, "Portuguese");
	
	do
	{	
		printf("\n\n1 - Cadastrar Alunos \n\n");
		printf("\n\n2 - Calcular Notas\n\n");
		printf("\n\n3 - Fechar\n\n");
		scanf("%d",&op);
		
		system("cls");

				switch(op)
				{
				case 1:
				CadastroAlunos(nome,ra);
				break;
				
				case 2:
				EntradaMedia();		
				break;
				
				case 3:
				printf("Caso Ainda não terminado");
				break;
				
				default:
				printf("Opção Invalida");
				break;	
				}	
	}while(op!=3);
	
	return 0;
}
