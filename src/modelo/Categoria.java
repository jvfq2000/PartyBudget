package modelo;

import java.awt.Image;

public class Categoria extends Base{
    private Image imgFestaCat;
    private String tipoCategoria; //"PRODUTO" ou "FESTA"

    public String getTipoCategoria() {
        return tipoCategoria;
    }
    public void setTipoCategoria(String tipoCategoria) {
        this.tipoCategoria = tipoCategoria;
    }
    
    public void cadastrarOuAlterar(String nome, String tpCat){
        cadastrarOuAlterar(nome);
        setTipoCategoria(tpCat);
    }
}
