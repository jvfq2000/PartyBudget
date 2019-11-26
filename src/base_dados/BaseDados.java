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
        categoria.cadastrarOuAlterar("BEBIDAS ALCOOLICAS", "PRODUTO");
        BaseDados.listaCat.add(categoria);
        categoria = new Categoria();
        categoria.cadastrarOuAlterar("BEBIDAS NÃO ALCOOLICAS", "PRODUTO");
        BaseDados.listaCat.add(categoria);
        categoria = new Categoria();
        categoria.cadastrarOuAlterar("COMIDAS GERAIS", "PRODUTO");
        BaseDados.listaCat.add(categoria);
        categoria = new Categoria();
        categoria.cadastrarOuAlterar("CARNES", "PRODUTO");
        BaseDados.listaCat.add(categoria);
        categoria = new Categoria();
        categoria.cadastrarOuAlterar("DESCARTÁVEIS", "PRODUTO");
        BaseDados.listaCat.add(categoria);
        categoria = new Categoria();
        categoria.cadastrarOuAlterar("DOCES", "PRODUTO");
        BaseDados.listaCat.add(categoria);
        categoria = new Categoria();
        categoria.cadastrarOuAlterar("SALGADOS", "PRODUTO");
        BaseDados.listaCat.add(categoria);
        
        
        
        categoria = new Categoria();
        categoria.cadastrarOuAlterar("15 ANOS", "FESTA");
        BaseDados.listaCat.add(categoria);
        categoria = new Categoria();
        categoria.cadastrarOuAlterar("ANIVERSÁRIO", "FESTA");
        BaseDados.listaCat.add(categoria);
        categoria = new Categoria();
        categoria.cadastrarOuAlterar("BODAS", "FESTA");
        BaseDados.listaCat.add(categoria);
        categoria = new Categoria();
        categoria.cadastrarOuAlterar("BATIZADO", "FESTA");
        BaseDados.listaCat.add(categoria);
        categoria = new Categoria();
        categoria.cadastrarOuAlterar("CASAMENTO", "FESTA");
        BaseDados.listaCat.add(categoria);
        categoria = new Categoria();
        categoria.cadastrarOuAlterar("CHÁ DE PANELA", "FESTA");
        BaseDados.listaCat.add(categoria);
        categoria = new Categoria();
        categoria.cadastrarOuAlterar("INFANTIL", "FESTA");
        BaseDados.listaCat.add(categoria);
        categoria = new Categoria();
        categoria.cadastrarOuAlterar("NO TRABALHO", "FESTA");
        BaseDados.listaCat.add(categoria);
        
        
        
        
        
        produto = new Produto();
        produto.cadastrarOuAlterar("REFRIGERANTE LATA 500ML", 70, 2.99, 2);
        BaseDados.listaProduto.add(produto);
        produto = new Produto();
        produto.cadastrarOuAlterar("SUCO LATA 600ML", 50, 2.5, 2);
        BaseDados.listaProduto.add(produto);
        produto = new Produto();
        produto.cadastrarOuAlterar("ÁGUA MINERAL 500ML", 100, 2, 2);
        BaseDados.listaProduto.add(produto);
        produto = new Produto();
        produto.cadastrarOuAlterar("ENERGÉTICO", 60, 7.59, 2);
        BaseDados.listaProduto.add(produto);
        produto = new Produto();
        produto.cadastrarOuAlterar("CERVEJA LATA 600ML", 70, 3.78, 1);
        BaseDados.listaProduto.add(produto);
        produto = new Produto();
        produto.cadastrarOuAlterar("CHOPP 10L", 2, 120, 1);
        BaseDados.listaProduto.add(produto);
        produto = new Produto();
        produto.cadastrarOuAlterar("VODKA 1L", 10, 32.69, 1);
        BaseDados.listaProduto.add(produto);
        produto = new Produto();
        produto.cadastrarOuAlterar("COLHER PCT 20UN", 10, 2.46, 5);
        BaseDados.listaProduto.add(produto);
        produto = new Produto();
        produto.cadastrarOuAlterar("COPO PCT 100UN", 2, 3.67, 5);
        BaseDados.listaProduto.add(produto);
        produto = new Produto();
        produto.cadastrarOuAlterar("PRATO PCT 20UN", 10, 2.83, 5);
        BaseDados.listaProduto.add(produto);
        produto = new Produto();
        produto.cadastrarOuAlterar("GUARDANAPO PCT 50UN", 4, 4, 5);
        BaseDados.listaProduto.add(produto);
        produto = new Produto();
        produto.cadastrarOuAlterar("ESQUEIRO", 2, 2.5, 7);
        BaseDados.listaProduto.add(produto);
    }
}
