package primeiroprograma;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Date;
import java.util.Locale;

public class Primeiroprograma {

    public static void main(String[] args) {
        Date relogio = new Date();
        System.out.println("Hora do Sitema: "+relogio.toString());
        Locale locale = Locale.getDefault();
        System.out.println("Linguagem do seu Sistema: " + locale.getDisplayLanguage());
        
        Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
        System.out.println("Sua tela eh: "+ tela.width +" X " + tela.height);
        
    }
    
}
