abstract class Produto
{
    protected String titulo;
    protected String anoDeLancamento;
    protected String categoria;
    protected String idCodigo;

    private float preco;
    private float desconto;
    private int qnt; 

    public Produto(float preco, float desconto, int qnt, String titulo, String anoDeLancamento, String categoria,String codigo)
    {
        this.preco = preco;
        this.desconto = desconto;
        this.qnt = qnt;
        this.anoDeLancamento = anoDeLancamento;
        this.categoria = categoria;
        this.titulo = titulo;
        this.idCodigo = codigo;
    }


    public void Setpreco(float valor) 
    {
        this.preco = valor - (valor * (desconto/100.0f));
    }

    public void Setdesconto(float valor)
    {
        if(valor >= 0)
        {
            this.desconto = valor;
            
            this.Setpreco(this.preco);
        }
             
    }

    public String Getcodigo()
    {
        return this.idCodigo;
    }
}