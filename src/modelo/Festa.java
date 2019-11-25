package modelo;

import java.util.ArrayList;

public class Festa extends Base{
    private String local, descricao;
    private String dataInicial, dataFinal;
    private String horaInicial, horaFinal;
    private double somaPrecoUnit, somaPrecoTotal;
    private int somaQtd;
    public ArrayList<Produto> listaProduto = new ArrayList<>();
    public ArrayList<Categoria> listaCatProduto = new ArrayList<>();
    
    private int codCategoria;

    public int getCodCategoria() {
        return codCategoria;
    }
    public void setCodCategoria(int codCategoria) {
        this.codCategoria = codCategoria;
    }

    public String getDataInicial() {
        return dataInicial;
    }
    public void setDataInicial(String dataInicial) {
        this.dataInicial = dataInicial;
    }

    public String getDataFinal() {
        return dataFinal;
    }
    public void setDataFinal(String dataFinal) {
        this.dataFinal = dataFinal;
    }

    public String getHoraInicial() {
        return horaInicial;
    }
    public void setHoraInicial(String horaInicial) {
        this.horaInicial = horaInicial;
    }
    
    public String getHoraFinal() {
        return horaFinal;
    }
    public void setHoraFinal(String horaFinal) {
        this.horaFinal = horaFinal;
    }

    public String getLocal() {
        return local;
    }
    public void setLocal(String local) {
        this.local = local;
    }

    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
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
    
    public void cadastrarOuAlterar(String nome, String dtInicial, String dtFinal,
            String hrInicial, String hrFinal, String local, String descricao, int codCat){
        
        cadastrarOuAlterar(nome);
        setCodCategoria(codCat);
        setDataInicial(dtInicial);
        setDataFinal(dtFinal);
        setHoraInicial(hrInicial);
        setLocal(local);
        setDescricao(descricao);
        setHoraFinal(hrFinal);
    }
}