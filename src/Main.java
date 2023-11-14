import Animais.Cachorro;

public class Main {
    public static void main(String[] args) {

        Cachorro meuDog = new Cachorro("Fuffy", "mista", "branco", 42, 32.5);
        System.out.println(Cachorro.getNumeroDeCachorros());

        Cachorro outroDog = new Cachorro("Spike", "pastor alemão", "laranja/preto", 47, 41.0);
        System.out.println(Cachorro.getNumeroDeCachorros());

        Cachorro maisUmCachorro = new Cachorro();
        System.out.println(Cachorro.getNumeroDeCachorros());
        
//        meuDog = outroDog;

        meuDog.interagir("carinho");
        System.out.println(meuDog.toString());
        System.out.println(outroDog.toString());
    }
}