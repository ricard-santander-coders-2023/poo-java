package Animais;

public class Passaro extends Animal{

    static int numeroDePassaros;
    public Passaro(String nome, String raca, String cor, double peso) {
        super(nome, raca, cor, peso);

        numeroDePassaros++;
    }

    @Override
    public void soar() {
        System.out.println("Piu piu!");
    }

//    @Override
//    public String toString() {
//        return "Passaro{" +
//                "nome='" + nome + '\'' +
//                ", raca='" + raca + '\'' +
//                ", cor='" + cor + '\'' +
//                ", altura=" + altura + "cm" +
//                ", peso=" + peso + "kg" +
//                ", estadoDeEspirito='" + estadoDeEspirito + '\'' +
//                '}';
//    }

}
