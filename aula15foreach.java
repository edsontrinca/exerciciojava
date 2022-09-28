import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class aula15foreach {
    public static void main(String[] args) {

        List <Integer> itens = Arrays.asList(10,11,16,5,85);
        itens.forEach (item-> System.out.println(item));
    }
}
