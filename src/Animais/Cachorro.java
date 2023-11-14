package Animais;

public class Cachorro {

    public String nome;
    public String raca;
    public String cor;
    public int altura;
    public double peso;
    public String estadoDeEspirito;

    public void comer() {
        System.out.println("Está comendo!");
    }

    public void latir() {
        System.out.println("Au au!!");
    }

    public String pegar() {
        return "bolinha";
    }

    public String interagir(String acao) {

//        if (acao.equals("carinho")) {
//            this.estadoDeEspirito = "feliz";
//        } else if (acao.equals("bronca")) {
//            this.estadoDeEspirito = "triste";
//        } else if (acao.equals("brinquedo")) {
//            this.estadoDeEspirito = "saltidando";
//        } else {
//            this.estadoDeEspirito = "de boa";
//        }
        switch (acao) {
            case "carinho" -> this.estadoDeEspirito = "feliz";
            case "bronca" -> this.estadoDeEspirito = "triste";
            case "brinquedo" -> this.estadoDeEspirito = "saltidando";
            default -> this.estadoDeEspirito = "de boa";
        }
        return estadoDeEspirito;
    }

}
