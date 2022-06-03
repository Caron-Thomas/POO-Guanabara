package ExeAula2;

public enum Estilo {

    CONTEPORANEA("Desdobramento da dança moderna.","Dança contemporânea",1),
    BALLET("Dança clássica","Ballet",2),
    SAMBA("Dança Crássika","Samba",3),
    JAZZ("Dança da SylHe","Jazz",4),
    KPOP("wtf","K-Pop",5),
    VENTRE("Bellydance","Ventre",6);

    Estilo(String descricao, String nome, int numero){
        this.descricao = descricao;
        this.nome = nome;
        this.numero = numero;
    }
    public String descricao;
    public String nome;
    int numero;
}
