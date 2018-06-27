/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testestipos;

/**
 *
 * @author User
 */
public class TestesTipos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /* int idade = 30;
        String valor = Integer.toString(idade);
        
        System.out.println(valor);
*/
       String valor = "30.6";
       
      float idade = Float.parseFloat(valor);
        System.out.printf("nota eh %4f",idade);
        
        // TODO code application logic here
    }
    
}
