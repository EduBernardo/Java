/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadorternario;

/**
 *
 * @author User
 */
public class OperadorTernario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //int n1 = 14, n2 = 18, r=(n1>n2?n1:n2); -> Serve tanto para condicoes simples
        int n1 = 14, n2 = 8, r=(n1>n2?n1+n2:n1-n2);//Quanto para Logicas
        System.out.println(r);
        
       
        
    }
    
}
