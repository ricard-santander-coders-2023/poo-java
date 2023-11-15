import Animais.Cachorro;
import Animais.Gato;
import Animais.Passaro;

public class Main {
    public static void main(String[] args) {

        Cachorro meuDog = new Cachorro("Fuffy", "mista", "branco", 42, 32.5);

        Gato bichano = new Gato("Garfield", "persa", "laranja/listras pretas", 28, 45);

        Passaro piuPiu = new Passaro("Piu-piu", "canario", "amarelo", 0.5);

        meuDog.soar();
        bichano.soar();
        piuPiu.soar();
    }
}