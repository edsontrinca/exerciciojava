import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class aula13foroff {

    public static void main(String[] args) {


        List <String> novosProdutos = new ArrayList<String>();

        novosProdutos.add("Iate");
        novosProdutos.add("Helicoptero");
        novosProdutos.add("Jet Ski");
        novosProdutos.add("Carro");
        novosProdutos.add("Submarino");
        novosProdutos.add("Aviao");

        for (String lista : novosProdutos) {
            System.out.println(lista);

        }
    }
}
