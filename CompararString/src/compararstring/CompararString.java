/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compararstring;

/**
 *
 * @author User
 */
public class CompararString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nome1 = "Gustavo";
        String nome2 = "Gustavo";
        String nome3 = new String ("Gustavo");
        String res;
        //res= (nome1==nome2)?"Igual":"Diferente";//Isso serve para verificar se sao iguais, sem analisar de fato o conteudo
        
        res= (nome1.equals(nome3))?"igual":"Diferente";//Esse serve para comparar conteudos em qualquer classe involucra
        System.out.println(res);
        
        String conc;
        
        conc =nome1+nome2;
        
        System.out.println(conc);
        
    }
    
}
