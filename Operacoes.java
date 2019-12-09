import java.util.ArrayList;


abstract class Operacoes
{
    protected static ArrayList<Produto> produtos;

    public Operacoes(ArrayList <Produto> p)
    {
        produtos = p;
    }

    abstract public boolean RetirarProduto(String codigo);
    abstract public boolean RetirarProduto(String[] categoria);
}

class Vende extends Operacoes
{

    public Vende(ArrayList<Produto> prods)
    {
        super(prods);
    }

    @Override
    public boolean RetirarProduto(String codigo) 
    {
        return false;
    }

    @Override
    public boolean RetirarProduto(String[] categoria) 
    {
        return false;
    }
}

class Aluga extends Operacoes
{
    private static HashMap<String,Integer> alugados;
    
    public Aluga(ArrayList<Produto> prods)
    {
        super(prods);
    }

    @Override
    public boolean RetirarProduto(String[] categoria)
    {
        return false;
    }
    
    @Override
    public boolean RetirarProduto(String codigo)
    {
        return false;
    }

    public boolean DevolverProduto()
    {
        return false;    
    }

}