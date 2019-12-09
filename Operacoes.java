import java.util.ArrayList;


abstract class Operacoes
{
    protected static ArrayList<Produto> produtos;

    public Operacoes(ArrayList <Produto> p)
    {
        produtos = p;
    }

    abstract public boolean RetirarProduto(String codigo,int qntProd);
}

class Vende extends Operacoes
{

    public Vende(ArrayList<Produto> prods)
    {
        super(prods);
    }

    @Override
    public boolean RetirarProduto(String codigo,int qntProd) 
    {

        for(Produto p : produtos)
        {
            if(p.Getcodigo().equals(codigo))
            {
                if(p.SetqntTotal(qntProd))
                {
                    if(p.GetqntTotal() == 0)
                        Operacoes.produtos.remove(p);

                    return true;
                }
                else
                {
                    return false;
                }
            }    
        }

        return false;
    }
}

class Aluga extends Operacoes
{ 
    public Aluga(ArrayList<Produto> prods)
    {
        super(prods);
    }
    
    @Override
    public boolean RetirarProduto(String codigo,int qntProd)
    {
        return false;
    }

    public boolean DevolverProduto()
    {
        return false;    
    }

}