import java.util.ArrayList;

class Filme extends Produto
{
    private String produtora;
    private String diretor;


    public Filme(String titulo, String diretor, String produtora, String anoDeLancamento, String categoria, float preco, float desconto, int qnt, String codigo)
    {
        super(preco, desconto, qnt , titulo , anoDeLancamento , categoria, codigo);
        this.titulo=titulo;
    }

    public String GetTitulo()
    {    
        return titulo;
    }

    public boolean SetTitulo(String nTitulo)
    {
        if(nTitulo != null)
        {
            this.titulo = nTitulo;
            
            return true;
        }
        return false;
    }

}