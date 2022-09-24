public class aula13forin {

    public static void main(String[] args) {

        String [] novosProdutos = new String[4];

        String banana = "Banana";
        String maca = "Maçã";
        String uva = "Uva";

        novosProdutos[0] = banana;
        novosProdutos[1] = maca;
        novosProdutos[2] = uva;

        for (int i=0; i <novosProdutos.length; i++){

            System.out.println(novosProdutos[i]);

        }

    }
}
