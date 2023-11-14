import Animais.Cachorro;

public class Main {
    public static void main(String[] args) {

        Cachorro meuDog = new Cachorro();

        meuDog.nome = "Fluffy";
        meuDog.raca = "mista";
        meuDog.cor = "branco";
        meuDog.altura = 42;
        meuDog.peso = 32.5;

        System.out.println( meuDog);

    }
}