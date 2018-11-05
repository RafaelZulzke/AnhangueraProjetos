package produtos;

public class Mouse extends Produto
{
public String tipo; 

    public Mouse(String descricao , String tipo) 
    {
        super.descricao = descricao;
        this.tipo = tipo;
    }


@Override
    public String getDescricao() 
    {
        return "Modelo : " + descricao + " Tipo: "+ tipo;
    }



}
