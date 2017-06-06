/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numeros;

import javax.swing.JOptionPane;

/**
 *
 * @author Administrador
 */
public class Numeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int soma = 0;
        int numero;
        int par = 0;
        int impar = 0;
        do {
            numero = Integer.parseInt(JOptionPane.showInputDialog(null, "<html>Informe número: <br><en>(valor 0 interrompe)</en> </html>", JOptionPane.INFORMATION_MESSAGE));
            if (numero % 2 == 0) {
                par++;
            } else {
                impar++;
            }
            soma+=numero;
            } while (numero != 0);
        par--;
        JOptionPane.showMessageDialog(null,"<html>RESULTADO<br>-----------------------<br><br>"+
        "Quantidade de par: "+par+
        "<br> Quantidade de impar: "+impar+
        "<br>Soma de todos os valores: "+soma+"</html>");

      
              
        

}
}
