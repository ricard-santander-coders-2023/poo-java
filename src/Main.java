import Animais.Cachorro;

public class Main {
    public static void main(String[] args) {

        Cachorro meuDog = new Cachorro("Fuffy", "mista", "branco", 42, 32.5);
        Cachorro outroDog = new Cachorro();

//        meuDog.setNome("Fluffy");
//        meuDog.setRaca("mista");
//        meuDog.setCor("branco");
//        meuDog.setAltura(42);
//        meuDog.setPeso(32.5);

//        System.out.println( meuDog);

        meuDog.comer();
        meuDog.latir();

        System.out.println(meuDog.getNome() + " foi buscar " + meuDog.pegar());

        System.out.println(meuDog.getNome() + " ficou " + meuDog.interagir("carinho"));
        System.out.println(meuDog.getNome() + " ficou " + meuDog.interagir("bronca"));
        System.out.println(meuDog.getNome() + " ficou " + meuDog.interagir("brinquedo"));

        System.out.println(meuDog.toString());

    }
}