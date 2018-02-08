/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author thalyson
 */
public interface CopiarColar {
    
    public abstract void copiarJtA(JTextArea areaTexto);
    public abstract void colarJtA(JTextArea areTexto);
    public abstract void copiarJtF(JTextField campoTexto);
    public abstract void colarJtF(JTextField campoTexto);
    public abstract void copiarStr(String campoString);
    public abstract void colarStr(String campoString);
}
