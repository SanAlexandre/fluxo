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
        String path = JOptionPane.showInputDialog(null, "Digite o endereço do arquivo ou diretório: ", "Fluxo de Dados", JOptionPane.PLAIN_MESSAGE);
        File nome = new File(path);
        
        if(nome.exists()){
            
            JOptionPane.showMessageDialog(null, "\nNome: "+nome+
                    "\n"+(nome.isFile()? "É um arquivo" : "Não é um arquivo")+
                    "\n"+(nome.isDirectory()? "É um diretório" : "Não é um diretório")+
                    "\n"+(nome.isAbsolute()? "É um endereço absoluto" : "Não é um endereço absoluto")+
                    "\nÚltima modificação: "+(nome.lastModified())+
                    "\nTamanho: "+(nome.length())+
                    "\nEndereço: "+(nome.getPath())+
                    "\nEndereço absoluto: "+(nome.getAbsolutePath())+
                    "\nPai: "+(nome.getParent()), "Fluxo de Dados", JOptionPane.PLAIN_MESSAGE);
        
        }
        
        if(nome.isDirectory()){
            
            String[] diretorio = nome.list();
            String nomes = "";
            for(String nomeDir : diretorio)
                nomes = nomes + "\n" + nomeDir;
            JOptionPane.showMessageDialog(null, "Esse diretório contém: \n"+nomes, "Fluxo de Dados", JOptionPane.PLAIN_MESSAGE); 
            
        }
        
        if(nome.exists() == false){
            JOptionPane.showMessageDialog(null, "O arquivo ou diretório '"+path+"' não existe.", "Fluxo de Dados", JOptionPane.PLAIN_MESSAGE);
        }
        
    }
}