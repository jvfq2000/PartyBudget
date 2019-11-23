/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcao;

import base_dados.BaseDados;
import static base_dados.BaseDados.listaCat;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 *
 * @author ji
 */
public class Validacoes {
    public static boolean validaDataOuHora(String s, String format) {
        DateFormat df = new SimpleDateFormat(format);
        df.setLenient(false);
        
        try {
            df.parse(s);
            return true;
        } catch (ParseException ex) {
            return false;
        }
    }

    public static int buscaCategoria(int codigo) {
        int posiCat = -1;

        for (int i = 0; i < BaseDados.listaCat.size(); i++) {
            if (BaseDados.listaCat.get(i).getCODIGO() == codigo) {
                posiCat = i;
            }
        }
        return posiCat;
    }
}
