package base_dados;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import modelo.Festa;
import modelo.Categoria;
import modelo.Produto;

public class BaseDados {

    public static ArrayList<Festa> listaFesta = new ArrayList<>();
    public static ArrayList<Categoria> listaCat = new ArrayList<>();
    public static ArrayList<Produto> listaProduto = new ArrayList<>();

    private Categoria categoria;
    private Produto produto;
    private Festa festa;

    public void cadastrar() {
        categoria = new Categoria();
        categoria.cadastrarOuAlterar("BEBIDAS", "PRODUTO");
        BaseDados.listaCat.add(categoria);

        categoria = new Categoria();
        categoria.cadastrarOuAlterar("COMIDAS", "PRODUTO");
        BaseDados.listaCat.add(categoria);

        categoria = new Categoria();
        categoria.cadastrarOuAlterar("ANIVERSÁRIO", "FESTA");
        BaseDados.listaCat.add(categoria);

        categoria = new Categoria();
        categoria.cadastrarOuAlterar("CASAMENTO", "FESTA");
        BaseDados.listaCat.add(categoria);

        festa = new Festa();
        festa.cadastrarOuAlterar("FESTA DE ANIVERSÁRIO", "01/11/2019", "01/11/2019", "15:00", "20:00", "LOCAL ANIVERSARIO", "", 3);
        BaseDados.listaFesta.add(festa);
        
        festa = new Festa();
        festa.cadastrarOuAlterar("FESTA DE CASAMENTO", "01/11/2019", "01/11/2019", "15:00", "15:00", "LOCAL CASAMENTO", "", 4);
        BaseDados.listaFesta.add(festa);
        
        produto = new Produto();
        produto.cadastrarOuAlterar("REFRIGERANTE LATA 500ML", 50, 2.5, 1, 0);
        BaseDados.listaProduto.add(produto);
        
        produto = new Produto();
        produto.cadastrarOuAlterar("SUCO LATA 600ML", 30, 2.5, 1, 0);
        BaseDados.listaProduto.add(produto);

        produto = new Produto();
        produto.cadastrarOuAlterar("BIFE 1KG", 5, 10, 2, 0);
        BaseDados.listaProduto.add(produto);
        
        produto = new Produto();
        produto.cadastrarOuAlterar("ALFACE 1PÉ", 3, 3, 2, 0);
        BaseDados.listaProduto.add(produto);
    }
}
