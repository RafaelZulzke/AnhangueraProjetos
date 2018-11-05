PARSER_BEGIN(calculo)
import java.io.PrintStream;
public class calculo
{
public static void main(String[] args) throws ParseException
	{
		try
		{
		    calculo verificador = new calculo(new java.io.StringReader(args[0]));
		    verificador.S();
			verificador.Soma();
			verificador.SomV();
			verificador.DivSub();
			verificador.DivSubMei();
		    System.out.println("Verificado com sucesso!");
		}
		catch(ParseException e)
		{
			System.out.println(e.getMessage());
			System.out.println("Erro na sentença!");
		}
	}
}
PARSER_END(calculo)

SKIP:
{
	" "
	| "\n"
	| "\r"
	| "\t"
}

TOKEN:
{
	<NUM: (["0"-"9"])+ | (["0"-"9"])+"."(["0"-"9"])+> | <PLUS: "+"> | <MINUS:"-"> | <TIMES:"*"> |<DIVIDE:"/"> | "(" | ")" 
}

void S():
{}
{
<NUM>
}

void Soma():
{}
{
<NUM>(<PLUS><NUM>)*<EOF>
}	

void SomV():
{}
{
<NUM>(<PLUS><NUM>(<TIMES>))*<EOF>
}

void DivSub():
{}
{
<NUM>(<DIVIDE>(<NUM><MINUS><NUM>))*<EOF>
}

void DivSubMei():
{}
{
<NUM>"."<NUM>(<DIVIDE>(<NUM>"."<NUM><MINUS><NUM>"."<NUM>))*<EOF>			
}