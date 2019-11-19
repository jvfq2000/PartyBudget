package modelo;

public class Base {
    private static int ultCod = 0;
    private final int CODIGO;
    private String nome;
    
    public Base() {
        ultCod++;
        this.CODIGO = ultCod;
    }

    public int getCODIGO() {
        return CODIGO;
    }
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void cadastrarOuAlterar(String nome){
        setNome(nome);
    }
}
