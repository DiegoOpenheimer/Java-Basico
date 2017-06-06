/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparacaostring;

/**
 *
 * @author Administrador
 */
public class ComparacaoString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nome = "diego";
        String nome2 = "diego";
        String nome3 = new String("diego");
        String res = (nome.equals(nome3))?"igual":"diferente";
        System.out.println(" "+res);
        
    }
    
}
