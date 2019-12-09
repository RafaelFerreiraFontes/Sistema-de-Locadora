abstract class Produto
{
    protected String titulo;
    protected String anoDeLancamento;
    protected String categoria;
    protected String idCodigo;

    private float preco;
    private float desconto;
    private int qnt; 
    private int qntOcupada;

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

    public int GetqntTotal(){
        
        return qnt;
    
    }

    public int GetqntDisponivel()
    {
        return (this.qnt - this.qntOcupada);
    }

    public boolean SetqntDisponivel(int n)
    {
        if(GetqntDisponivel() > 0)
        {
            qntOcupada += n;

            return true;
        }

        return false;
    }

    public boolean SetqntTotal(int n)
    {
        if(GetqntDisponivel() > 0)
        {
            qntOcupada -= n;
            qnt -= n;

            return true;
        }

        return false;
    }

    public String Getcodigo()
    {
        return this.idCodigo;
    }
}