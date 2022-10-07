import java.util.Scanner;

public class aula19 {

    final static Scanner input = new Scanner(System.in);

    final static String acaoCadastroDoProduto = " Produto ";
    final static String acaoCadatroDeCliente = " Cliente ";
    final static String acaoCadastroDeEmpresa = " Empresa ";

    public static Cliente cadastrarCliente (Cliente cliente) {
        if ( cliente.getNome() != null && !cliente.getNome().isEmpty()){
            System.out.println( " Cliente cadastrado com sucesso! ");
        }
        return cliente;
    }
    public static Produto cadastrarProduto (Produto produto){
        if (produto.getNome() != null && !produto.getNome().isEmpty() && produto.getPreco() != null && !produto.getPreco().isNaN()) {
        System.out.println( " Produto " + produto.getNome() + " cadastrado com sucesso! ");
        }else{
            System.out.println( " Verifique os dados do produto e tente cadastrar novamente. ");
        }
        return produto;

        }

        public static Empresa cadastrarEmpresa (Empresa empresa){
        if (empresa.getRazaoSocial() != null && !empresa.getRazaoSocial().isEmpty()) {
            System.out.println( " Empresa cadastrada com sucesso ");
        }
        return empresa;
        }

    public static void main(String[] args) {
        Produto produto = new Produto();
        Endereco endereco = new Endereco();
        Cliente cliente = new Cliente();
        Empresa empresa = new Empresa();

        System.out.println( " Deseja realizar qual tipo de acao? ");

        System.out.println( " Cadastrar Produto? Digite -> Produto ");
        System.out.println( " Cadastrar Empresa? Digite -> Empresa ");
        System.out.println( " Cadastrar Cliente? Digite -> Cliente ");

        String operacaoEscolhida = input.next();

        if ( operacaoEscolhida.equals(acaoCadastroDoProduto)) {
            System.out.println( " Seja bem vindo ao Cadastro de Produto! ");
            System.out.println( " Digite o nome do produto: ");
            String nomeDoProdutodigitado = input.next();
            produto.setNome(nomeDoProdutodigitado);
            System.out.println( " Digite o preco do produto: ");
            Double precoDoProdutoDigitado = input.nextDouble();
            produto.setPreco(precoDoProdutoDigitado);

            cadastrarProduto(produto);
        } else if (operacaoEscolhida.equals(acaoCadatroDeCliente)) {
            System.out.println( " Bem vindo ao cadastro de Cliente! ");
            System.out.println( " Digite o nome do Cliente: ");

            cliente.setNome(input.next());
            System.out.println( " Digite o CPF do Cliente: ");
            Long cpfDigitado = input.nextLong();
            System.out.println( " Digite sua idade: ");
            Integer idadeDigitada = input.nextInt();
            System.out.println( " Digite a data de nascimento: ");
            String dataDeNascimentoDigitada = input.next();
            cliente.setDataDeNascimento(dataDeNascimentoDigitada);

            cadastrarCliente(cliente);
        } else if (operacaoEscolhida.equals(acaoCadastroDeEmpresa)) {
            System.out.println( " Seja Bem vindo ao cadastro de Empresa! ");
            System.out.println( " Digite a razao social que deseja cadastrar: ");

            empresa.setRazaoSocial(input.next());
            System.out.println( " Digite o Nome Fantasia da Empresa; ");
            String fantasiaDigitado = input.next();
            System.out.println( " Digite o CNPJ: ");
            Integer cnpjDigitado = input.nextInt();
            empresa.setCnpj(cnpjDigitado);

            cadastrarEmpresa(empresa);

        }
    }
    }

