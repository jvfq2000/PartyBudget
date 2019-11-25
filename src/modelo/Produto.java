package modelo;

public class Produto extends Base{
    private int quantidade, somaQtd;
    private Double precoUnitario, somaPrecoUnit, somaPrecoTotal;
    
    private int codCategoria;

    public int getCodCategoria() {
        return codCategoria;
    }
    public void setCodCategoria(int codCategoria) {
        this.codCategoria = codCategoria;
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

    public int getSomaQtd() {
        return somaQtd;
    }
    public void setSomaQtd(int somaQtd) {
        this.somaQtd = somaQtd;
    }

    public Double getSomaPrecoUnit() {
        return somaPrecoUnit;
    }
    public void setSomaPrecoUnit(Double somaPrecoUnit) {
        this.somaPrecoUnit = somaPrecoUnit;
    }

    public Double getSomaPrecoTotal() {
        return somaPrecoTotal;
    }
    public void setSomaPrecoTotal(Double somaPrecoTotal) {
        this.somaPrecoTotal = somaPrecoTotal;
    }
    
    public void cadastrarOuAlterar(String nome, int qtdProduto, double preUnit, int codCat){
        cadastrarOuAlterar(nome);
        setCodCategoria(codCat);
        setPrecoUnitario(preUnit);
        setQuantidade(qtdProduto);
    }
}
