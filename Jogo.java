class Jogo extends Produto{

    private String publicadora;
    private String desenvolvedora;
    private String plataformas;

    public Jogo(String publicadora, String desenvolvedora, String plataformas, String titulo, String anoDeLancamento, String categoria, float preco, float desconto, int qnt,String codigo)
    {
        super(preco, desconto, qnt, titulo, anoDeLancamento, categoria,codigo);
     
        this.publicadora = publicadora;
        this.desenvolvedora = desenvolvedora;
        this.plataformas = plataformas;
    }

}