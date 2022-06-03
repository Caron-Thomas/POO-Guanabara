package ExeAula2;

public class App {
    public static void main(String[] args) {

        Coreografia c1 = new Coreografia("Palco de Ballet",15,"Primavera de Vivaldi","Saia Plissada",Estilo.BALLET,true);
        Coreografia c2 = new Coreografia();
        c2.cenario = "Bananeiras ao fundo";
        c2.costumme = "Carmen Miranda style";
        c2.music = "Samba anos 50";
        c2.moving = false;
        c2.estilo = Estilo.SAMBA;
        c2.duration = 23;

        c1.status();
        c1.iniciarDanca();
        System.out.println();
        System.out.println("==================================");
        c2.status();
        c2.iniciarDanca();
    }
}
