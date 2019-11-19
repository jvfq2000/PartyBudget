package funcao;


import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

public class ApenasLetrasMaiusculas extends PlainDocument {
    
    @Override
    public void insertString(int offset, String str, javax.swing.text.AttributeSet attr)
    throws BadLocationException{
        super.insertString(offset, str.toUpperCase().replaceAll("",""), attr);
    }
}
