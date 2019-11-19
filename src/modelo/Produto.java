package modelo;

public class Produto extends Base{
    private int quantidade;
    private Double precoUnitario;
    
    private int codCategoria;
    private int codFesta;

    public int getCodCategoria() {
        return codCategoria;
    }
    public void setCodCategoria(int codCategoria) {
        this.codCategoria = codCategoria;
    }

    public int getCodFesta() {
        return codFesta;
    }
    public void setCodFesta(int codFesta) {
        this.codFesta = codFesta;
    }

    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }
    public void setPrecoUnitario(double preco) {
        this.precoUnitario = preco;
    }
    
    public void cadastrarOuAlterar(String nome, int qtdProduto, double preUnit, int codCat, int codFes){
        cadastrarOuAlterar(nome);
        setCodCategoria(codCat);
        setCodFesta(codFes);
        setPrecoUnitario(preUnit);
        setQuantidade(qtdProduto);
    }
}
