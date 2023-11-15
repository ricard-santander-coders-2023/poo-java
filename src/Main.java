import Animais.Cachorro;
import Animais.Gato;
import Animais.Passaro;
import Lojas.Petshop;

public class Main {
    public static void main(String[] args) {

        Cachorro meuDog = new Cachorro("Fluffy", "mista", "branco", 42, 32.5);

        Gato bichano = new Gato("Garfield", "persa", "laranja/listras pretas", 28, 45);

        Passaro piuPiu = new Passaro("Piu-piu", "canario", "amarelo", 0.5);

        Petshop novoPetshop = new Petshop();

        novoPetshop.tosar(meuDog);
        System.out.println(meuDog.getNome() + " está " + meuDog.getEstadoDeEspirito());

        novoPetshop.darBarnho(bichano);
        System.out.println(bichano.getNome() + " está " + bichano.getEstadoDeEspirito());

        novoPetshop.deixarNoHotel(piuPiu);
        System.out.println(piuPiu.getNome() + " está " + piuPiu.getEstadoDeEspirito());
    }
}