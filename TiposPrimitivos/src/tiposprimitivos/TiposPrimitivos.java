/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiposprimitivos;

import java.util.Scanner;



/**
 *
 * @author User
 */
public class TiposPrimitivos {

    /**
     * @param args the command lin\e arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        System.out.println("Digite o nome do Aluno");
        String nome = teclado.nextLine();
        System.out.println("Digite a nota do aluno");
        float nota = teclado.nextFloat();
            System.out.println("a nota eh " +nota);
            
            System.out.printf("a nota do %s e %.6f\n",nome , nota );

            System.out.format("a nota do %s e %f", nome, nota);
            
          

// TODO code application logic here
    }
    
}
