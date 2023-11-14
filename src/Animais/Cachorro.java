package Animais;

public class Cachorro {

    private String nome;
    private String raca;
    private String cor;
    private int altura;
    private double peso;
    private String estadoDeEspirito;

    public Cachorro() {}

    public Cachorro(String nome, String raca, String cor, int altura, double peso) {
        this.nome = nome;
        this.raca = raca;
        this.cor = cor;
        this.altura = altura;
        this.peso = peso;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return this.raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getCor() {
        return this.cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAltura() {
        return this.altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return this.peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

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
//            case "carinho" : this.estadoDeEspirito = "feliz"; break; // Se usar ":" tem que usar o break;
            case "bronca" -> this.estadoDeEspirito = "triste";
            case "brinquedo" -> this.estadoDeEspirito = "saltidando";
            default -> this.estadoDeEspirito = "de boa";
        }
        return estadoDeEspirito;
    }

    @Override
    public String toString() {
        return "Cachorro{" +
                "nome='" + nome + '\'' +
                ", raca='" + raca + '\'' +
                ", cor='" + cor + '\'' +
                ", altura=" + altura +
                ", peso=" + peso +
                ", estadoDeEspirito='" + estadoDeEspirito + '\'' +
                '}';
    }
}
