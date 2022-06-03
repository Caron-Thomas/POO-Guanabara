package ExeAula2;

public class Coreografia {

    protected String cenario;
    protected int duration;
    protected String music;
    protected String costumme;
    protected Estilo estilo;
    protected boolean moving;

    public Coreografia(String cenario, int duration, String music,String costumme, Estilo estilo, boolean moving){
        this.cenario = cenario;
        this.duration = duration;
        this.music = music;
        this.costumme = costumme;
        this.estilo = estilo;
        this.moving = moving;
    }

    public Coreografia() {

    }

    public void iniciarDanca(){
        if(this.moving){
            System.out.printf("\nEstou dançando %s",estilo.nome);
        }else if (!this.moving ){
            System.out.println();
            System.out.println("Estou me preparando para dançar!");
        }else{
            System.out.println("Sou apenas um espectador!");
        }
    }

    public void status(){
        System.out.println("Sou a dança do tipo: "+ this.estilo.nome);
        System.out.printf("Meu cenário é %s,\nA duração do espetáculo é de %d minutos,",this.cenario, this.duration);
        System.out.printf("\nA musica que toca é %s,\nE uso uma roupa tipo %s!!",this.music, this.costumme);
    }

}
