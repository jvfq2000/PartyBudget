package teste;

import base_dados.BaseDados;
import java.awt.BorderLayout;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class TesteExecuta extends JFrame{

    JTabbedPane painelDeAbas = new JTabbedPane();
    JPanel[] painel = new JPanel[BaseDados.listaFesta.size()];
    
    public TesteExecuta() {
        setTitle("Teste Janela Com Abas");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(600,600);
        setLocationRelativeTo(null);
        setVisible(true);
        
        add(BorderLayout.CENTER, painelDeAbas);
        for (int i = 0; i < BaseDados.listaFesta.size(); i++) {
            painel[i] = new JPanel();
            painelDeAbas.addTab(BaseDados.listaFesta.get(i).getNome(), painel[i]);
        }
        painelDeAbas.setVisible(true);
    }
    
    public static void main(String[] args) throws ParseException {
        Calendar c = Calendar.getInstance();
        Date data = c.getTime();
        DateFormat f = DateFormat.getDateInstance();
         
        Date data2 = f.parse("12/01/1995");
        System.out.println(data2);
         
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Data formatada: "+sdf.format(data));
         
        //Converte Objetos
        System.out.println("Data convertida: "+sdf.parse("02/08/1970"));
        
        BaseDados cadastroTeste = new BaseDados();
        cadastroTeste.cadastrar();
        System.out.println("Quantidade de festas: "+BaseDados.listaFesta.size());
        new TesteExecuta();
    }
}