package funcao;

import javax.swing.JOptionPane;

public class Mensagem {
    public static void sucessoCadastro(){
        JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");
    }
    
    public static void sucessoAlteracao(){
        JOptionPane.showMessageDialog(null, "Alterado com sucesso!");
    }
    
    public static void sucessoExclusao(){
        JOptionPane.showMessageDialog(null, "Excluido com sucesso!");
    }
    
    public static int confirmarExclusao(){
        return JOptionPane.showConfirmDialog(null, "Deseja excluir?", "Atenção!", JOptionPane.YES_NO_OPTION);
    }
    
    public static void sucessoSalvarAlter(){
        JOptionPane.showMessageDialog(null, "Alterações aplicadas com sucesso!");
    }
    
    public static int confirmarSalvarAlter(){
        return JOptionPane.showConfirmDialog(null, "Caso tenha removido uma categoria que contem produtos cadastrados,\n"
                + "esses produtos também serão removidos da festa!\n\n"
                + "Deseja realmente aplicar as alterações?", "Atenção!", JOptionPane.YES_NO_OPTION);
    }
    
    public static void camposObrigatorios(){
        JOptionPane.showMessageDialog(null, "Para continuar.\nInforme todos os dados obrigatórios(*)!");
    }
    
    public static void personalizada(String s){
        JOptionPane.showMessageDialog(null, s);
    }
}
