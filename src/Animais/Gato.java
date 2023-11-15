package Animais;

public class Gato extends Animal{

    static int numeroDeGatos;

    private int altura;

    @Override
    public void soar() {
        System.out.println("Miauuuu!");
    }

    public Gato(String nome, String raca, String cor, double peso, int altura) {
        super(nome, raca, cor, peso);
        this.altura = altura;

        numeroDeGatos++;
    }

//    @Override
//    public String toString() {
//        return "Gato{" +
//                "nome='" + nome + '\'' +
//                ", raca='" + raca + '\'' +
//                ", cor='" + cor + '\'' +
//                ", altura=" + altura + "cm" +
//                ", peso=" + peso + "kg" +
//                ", estadoDeEspirito='" + estadoDeEspirito + '\'' +
//                '}';
//    }
}
