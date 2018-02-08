/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author thalyson
 */
public class CopiarColar extends JFrame implements interfaces.CopiarColar {
    
    @Override
    public void copiarJtA(JTextArea areaTexto) {
        Clipboard board = Toolkit.getDefaultToolkit().getSystemClipboard();  
        ClipboardOwner selection = new StringSelection(areaTexto.getText());  
        board.setContents((Transferable) selection, selection);
    }

    @Override
    public void colarJtA(JTextArea areaTexto) {
        areaTexto.paste();
    }

    @Override
    public void copiarJtF(JTextField campoTexto) {
        Clipboard board = Toolkit.getDefaultToolkit().getSystemClipboard();  
        ClipboardOwner selection = new StringSelection(campoTexto.getText());  
        board.setContents((Transferable) selection, selection);
    }

    @Override
    public void colarJtF(JTextField campoTexto) {
        campoTexto.paste();
    }

    @Override
    public void copiarStr(String campoString) {
        Clipboard board = Toolkit.getDefaultToolkit().getSystemClipboard();  
        ClipboardOwner selection = new StringSelection(campoString);  
        board.setContents((Transferable) selection, selection);
    }

    @Override
    public void colarStr(String campoString) {
        JTextField campo = new JTextField();
        campo.setText(campoString);
        campo.paste(); // verificar método com o tempo
    }
}
