/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alexandre dos Santos de Oliveira
 */
import javax.swing.JOptionPane;
import java.io.File;

public class Fluxo {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        String path = JOptionPane.showInputDialog(null, "Digite o endere�o do arquivo ou diret�rio: ", "Fluxo de Dados", JOptionPane.PLAIN_MESSAGE);
        File nome = new File(path);
        
        if(nome.exists()){
            
            JOptionPane.showMessageDialog(null, "\nNome: "+nome+
                    "\n"+(nome.isFile()? "� um arquivo" : "N�o � um arquivo")+
                    "\n"+(nome.isDirectory()? "� um diret�rio" : "N�o � um diret�rio")+
                    "\n"+(nome.isAbsolute()? "� um endere�o absoluto" : "N�o � um endere�o absoluto")+
                    "\n�ltima modifica��o: "+(nome.lastModified())+
                    "\nTamanho: "+(nome.length())+
                    "\nEndere�o: "+(nome.getPath())+
                    "\nEndere�o absoluto: "+(nome.getAbsolutePath())+
                    "\nPai: "+(nome.getParent()), "Fluxo de Dados", JOptionPane.PLAIN_MESSAGE);
        
        }
        
        if(nome.isDirectory()){
            
            String[] diretorio = nome.list();
            String nomes = "";
            for(String nomeDir : diretorio)
                nomes = nomes + "\n" + nomeDir;
            JOptionPane.showMessageDialog(null, "Esse diret�rio cont�m: \n"+nomes, "Fluxo de Dados", JOptionPane.PLAIN_MESSAGE); 
            
        }
        
        if(nome.exists() == false){
            JOptionPane.showMessageDialog(null, "O arquivo ou diret�rio '"+path+"' n�o existe.", "Fluxo de Dados", JOptionPane.PLAIN_MESSAGE);
        }
        
    }
}