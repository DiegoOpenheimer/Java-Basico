/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programamedia;

import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author Administrador
 */
public class ProgramaMedia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic 
        Scanner teclado = new Scanner(System.in);
        int ano;
        Calendar data = Calendar.getInstance();
        System.out.print("Informe ano de nascimento: ");
        ano = teclado.nextInt();
        ano = data.get(Calendar.YEAR) - ano;
        System.out.println("Sua Idade é: "+ano);
        if (ano >= 18) {
            System.out.println("Maior");
        } else {
            System.out.println("Menor");
        }
    }

}
