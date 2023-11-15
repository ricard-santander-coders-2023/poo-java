import Animais.Cachorro;
import Animais.Gato;
import Animais.Passaro;
import Lojas.Petshop;

public class Main {
    public static void main(String[] args) {

        Cachorro meuDog = new Cachorro("Fuffy", "mista", "branco", 42, 32.5);
        Gato bichano = new Gato("Garfield", "persa", "laranja/listras pretas", 28, 45);
        Passaro piuPiu = new Passaro("Piu-piu", "canario", "amarelo", 0.5);

//comentário de uma linha
        meuDog.soar();

        bichano.soar();
        piuPiu.soar();
        /*
            comentário de varias linhas
            comentário de varias linhas
            comentário de varias linhas
         */

        // declaracao de variaveis
        //        int _$teste; //nao ideal
        //        double ______;  //nao ideal
        //    String int = "numero";  //nao ideal
        int inteiro;
        long longo;
        double ______ = 23.5;
        float $$;
        boolean $87;
        char ch;
        String teste;
        // valor padrao para variaveis não iniciadas é null
        // Ideal é iniciar com letra minuscula, _  ou $ e seguir o padrão camel-case

        double d = 5d;
        float f = 3.00f;

        float x = f + (float) d;
        System.out.println(x);

        int a = 234_234_234; // usando _ para separar

    }
}