package Aula2;

public class Caneta {
    String modelo;
    String cor;
    double ponta;
    int carga;
    boolean tampada;

    public void status(){
        String tampadaDestampada;
        tampadaDestampada = tampada ? "tampada" : "destampada";
        System.out.println("Status da caneta atual:");
        System.out.printf("Modelo: %s; \nCor: %s; \nPonta: %.2fmm; \nCarga: %d; \nPosição: %s.\n",this.modelo, this.cor, this.ponta, this.carga ,tampadaDestampada);
    }

    public void rabiscar(){
        if(this.tampada){
            System.out.println("Erro[] - Caneta tampada, não posso rabiscar!");
        }else {
            System.out.println("Okapa, estou rabiscando!!!");
        }
    }

    public void tampar(){
        this.tampada = true;
    }

    public void destampar(){
        this.tampada = false;
    }
}


