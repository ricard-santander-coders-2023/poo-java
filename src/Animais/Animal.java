package Animais;

public class Animal {

    static int numeroDeAnimais;
    private String nome;
    private String raca;
    private String cor;
    private double peso;
    private String estadoDeEspirito = "normal";

    public Animal(){};

    public Animal(String nome, String raca, String cor, double peso) {
        this.nome = nome;
        this.raca = raca;
        this.cor = cor;
        this.peso = peso;

        numeroDeAnimais++;
    }

    public static int getNumeroDeAnimais() {
        return numeroDeAnimais;
    }

    public static void setNumeroDeAnimais(int numeroDeAnimais) {
        Animal.numeroDeAnimais = numeroDeAnimais;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getEstadoDeEspirito() {
        return estadoDeEspirito;
    }

    public void setEstadoDeEspirito(String estadoDeEspirito) {
        this.estadoDeEspirito = estadoDeEspirito;
    }

    public void comer(){}

    public void dormir(){};
    public void soar(){
        System.out.println("Cri cri!");
    }
}
