package aula02;

public class Caneta {

    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada = true;

    public void status() {
        System.out.println("Cor: " + this.cor);
        System.out.println("Carga: " + this.carga);
        System.out.println("Tampada? " + tampada);
        System.out.println("Ponta: " + ponta);
        System.out.println("Modelo: " + modelo);
    }

    public void rabiscar() {
        if (tampada) {
            System.out.println("ERRO");
        } else {
            System.out.println("RABISCA");
        }
    }

    public void tampar() {
        if (!tampada) {
            tampada = true;
        }
    }

    public void destampar() {
        if (tampada) {
            tampada = false;
        }
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }

}
