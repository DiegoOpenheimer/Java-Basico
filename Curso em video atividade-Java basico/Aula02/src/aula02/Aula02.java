package aula02;
public class Aula02 {
  public static void main(String[] args) {
      Caneta c1 = new Caneta();
      c1.carga = 90;
      c1.cor = "azul";
      c1.modelo = "bic";
      c1.setPonta(0.9f);
      c1.tampar();
      c1.status();
  
  }
    
}
