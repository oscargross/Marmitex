import java.util.ArrayList;
import java.util.Scanner;

class Marmita {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Comida refeicao = new Comida();
        //Adicionar Saladas ao menu
        refeicao.addSaladas("Alface", 1.00);
        refeicao.addSaladas("Tomate", 1.20);
        refeicao.addSaladas("Couve-Flor", 1.40);
        refeicao.addSaladas("rucula", 1.20);
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
        
     

        refeicao.mostrarPrincipais();
        refeicao.mostrarSaladas();
        refeicao.mostrarSobremesas();
        refeicao.mostrarAdicionais();



        Marmita marmita = new Marmita();
        ArrayList<String> listaClientes = new ArrayList<>();
        String clienteO="";
        Cliente cliente=new Cliente(clienteO);
        System.out.println("Bem vindo ao Sistema Marmitex PF\nVocê já possui cadastro conosco?\n1 - sim        0 - não");
        int possuiCadastro = scan.nextInt();
        System.out.println("Qual o seu nome? ");
        String nome_1 = scan.next();
        if (cliente.verificaLista(nome_1)){
            System.out.println("Você já possui cadastro conosco");
        }else{
            System.out.println("Não possui cadastro");
            cliente.cadastrarCliente(nome_1);
        }
        System.out.println("Cadastro concluido com sucesso");
        
        marmita.plano();


 
    }

    public void plano() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o numero correspondente a opção: \n1 - Gostaria de fazer um pedido personaizado\n2 - Gostaria de adquirir o plano de marmitas semanais");
        Integer plano = scan.nextInt();    
        if (plano == 1){
            System.out.println("Os pratos são compostos por saladas, alimento principal e sobremesa");
            



        }
    }

}   

