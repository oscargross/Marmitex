import java.util.ArrayList;
import java.util.Scanner;

class Marmita {
    Scanner scan = new Scanner(System.in);//seção critica é a parte do codigo que pode ser acessada opr 2 processos ao mesmo tempo

    public static void main(String[] args) {
        Comida refeicao = new Comida();

        //Adicionar Saladas ao menu.
        refeicao.addSaladas("Alface", 1.00);
        refeicao.addSaladas("Tomate", 1.20);
        refeicao.addSaladas("Couve-Flor", 1.40);
        refeicao.addSaladas("rucula", 1.20);
        refeicao.addSaladas("Cenoura e Beterraba", 1.30);
        refeicao.addSaladas("Cenoura e Beterraba", 1.30);

        //Adicionar Partos Principais ao menu
        refeicao.addPrincipais("Arroz, Feijão e batata frita", 5.50);
        refeicao.addPrincipais("Massa com molho de galinha", 6.50);
        refeicao.addPrincipais("Panquecas", 7.00);
        refeicao.addPrincipais("Arroz com galinha", 4.50);
        refeicao.addPrincipais("Lasanha 4 queijos", 7.00);
        refeicao.addPrincipais("Purê e guizado", 6.50);
        refeicao.addPrincipais("Churrasco e maioneses", 7.50);

        //Adicionar Adicionais ao menu
        refeicao.addAdicionais("Carne de porco", 1.7);
        refeicao.addAdicionais("Carne de gado", 1.8);
        refeicao.addAdicionais("Carne de frango", 1.6);
        refeicao.addAdicionais("Queijo - feito na chapa", 1.3);
         
        //Adicionar Sobremesas ao menu
        refeicao.addSobremesas("sagu", 0.9);
        refeicao.addSobremesas("Torta de bolacha", 2.00);
        refeicao.addSobremesas("Ambrosia", 1.0);
        refeicao.addSobremesas("Pudim", 1.80);
        refeicao.addSobremesas("Mousse de maracujá", 1.5);
        
        //Adicionar Bebidas ao menu
        refeicao.addBebidas("Coca Cola", 5.0);
        refeicao.addBebidas("Pepsi", 4.5); 
        refeicao.addBebidas("Suco de Laranja", 4.00);
        refeicao.addBebidas("Suco de Uva", 4.00);
        refeicao.addBebidas("Agua", 2.0);
         
        refeicao.mostrarPrincipais();
        refeicao.mostrarSaladas();
        refeicao.mostrarSobremesas();
        refeicao.mostrarAdicionais();
        refeicao.mostrarBebidas();


        Scanner scan = new Scanner(System.in);
        Marmita funcaoCliente = new Marmita();
        funcaoCliente.cadastro();
        System.out.println("Selecione a opção:\n1 - desejo criar minha marmita\t2 - desejo o plano marmitas semanais");
        Double plano = scan.nextDouble();
        if (plano == 1){
            funcaoCliente.inserirItens();
        }

 
    }
    public void cadastro(){
        Cliente cliente = new Cliente();
        System.out.println("Bem vindo ao Sistema Marmitex PF\nPreencha os dados a seguir para completar o cadastro: ");
        System.out.println("Qual o seu nome: ");
        cliente.dados.setNome(scan.next()); 
        System.out.println("Qual o seu cpf: ");
        cliente.dados.setCpf(scan.nextInt()); 
        System.out.println("Qual o seu fone: ");
        cliente.dados.setFone(scan.nextInt()); 
        System.out.println("Qual a sua rua: ");
        cliente.dados.setRua(scan.next()); 
        System.out.println("Qual o numero de seu endereço: ");
        cliente.dados.setNumero(scan.nextInt()); 
        System.out.println("Qual a seu CEP: ");
        cliente.dados.setCep(scan.nextInt()); 
        System.out.println("Qual a seu Bairro: ");
        cliente.dados.setBairro(scan.next());
        cliente.adicionarCliente(cliente);
        System.out.println("Cadastro concluido com sucesso");
    }
    public void inserirItens() {
        ArrayList<Object> listaPedidos = new ArrayList<>();
        while (true){
            System.out.println("Escolha um dos itens:\n");
            refeicao.mostrarSaladas();
            int opcao = scan.nextInt(); 
            for ( int i =0; i < refeicao.listaSaladas.size();i++){
                if (opcao == i)   {
                    Object variavel = refeicao.listaSaladas.get(i);
                    listaPedidos.add(variavel);
                    break;
                }
            }
            System.out.println("Deseja escolher mais algum item:\n1: Sim\t2 - Nâo");
            Double maisItens = scan.nextDouble();
            if (maisItens == 1){
                continue;
            }else{
                break;
            }
        } 
        
    }
}   

