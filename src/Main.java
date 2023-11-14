import Animais.Cachorro;

public class Main {
    public static void main(String[] args) {

        Cachorro meuDog = new Cachorro();

        meuDog.nome = "Fluffy";
        meuDog.raca = "mista";
        meuDog.cor = "branco";
        meuDog.altura = 42;
        meuDog.peso = 32.5;

//        System.out.println( meuDog);

        meuDog.comer();
        meuDog.latir();

        System.out.println(meuDog.nome + " foi buscar " + meuDog.pegar());

        System.out.println(meuDog.nome + " ficou " + meuDog.interagir("carinho"));
        System.out.println(meuDog.nome + " ficou " + meuDog.interagir("bronca"));
        System.out.println(meuDog.nome + " ficou " + meuDog.interagir("brinquedo"));

    }
}