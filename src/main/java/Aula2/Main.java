package Aula2;

public class Main {
    public static void main(String[] args){

        Caneta c1 = new Caneta();
        c1.modelo = "Bic";
        c1.carga = 50;
        c1.cor = "Azul";
        c1.ponta = 0.5d;

        c1.tampar();
        c1.status();
        System.out.println("Vou rabiscar em 3,2,1...");
        c1.rabiscar();
        System.out.println("==============================");
        c1.destampar();
        c1.status();
        System.out.println("Vou rabiscar em 3,2,1...");
        c1.rabiscar();
    }
}
