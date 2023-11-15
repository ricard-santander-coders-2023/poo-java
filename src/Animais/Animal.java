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

    public void comer(){}

    public void dormir(){};
    public void soar(){
        System.out.println("Cri cri!");
    }
}
