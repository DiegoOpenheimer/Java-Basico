/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadoresaritmeticos;

import static java.lang.Math.sqrt;

/**
 *
 * @author Administrador
 */
public class OperadoresAritmeticos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       float n1 = 10f;
        float n2 = 5f;
        float result = (n1+n2)/2;
        int numero = 0,valor;
        valor=numero++ * 2;
       
        System.out.println(""+numero+" "+valor);
        System.out.println("A media é: "+result);
        numero = 25;
        System.out.printf("Raiz quadrada do número %d é: %d\n",numero,raiz(numero));
        
    }
    public static int raiz(int numero)
    {
        return (int) sqrt(numero);
    }
    
}
