import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class aula13while2 {

    static List<String> produto;

    public static void main(String[] args) {

        Scanner novosDados = new Scanner (System.in);

        produto = new ArrayList<>();

        int contador = 1;

        List<String> novosProdutos = new ArrayList<>();

        produto.add("Iate");
        produto.add("Helicoptero");
        produto.add("Jet Ski");
        produto.add("Carro");
        produto.add("Submarino");
        produto.add("Aviao");

        while (contador<= produto.size()) {

            contador ++;

            System.out.println(produto.get(contador -2));
        }

    }
}
