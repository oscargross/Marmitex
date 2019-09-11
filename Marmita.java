import java.util.ArrayList;
import java.util.Scanner;

class Marmita {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
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
        
        refeicao.mostrarPrincipais();
        refeicao.mostrarSaladas();
        refeicao.mostrarSobremesas();
        refeicao.mostrarAdicionais();

        Cliente cliente = new Cliente();
        ArrayList<String> listaClientes = new ArrayList<>();
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
        System.out.println("Cadastro concluido com sucesso");
        cliente.getListaClientes.add(cliente);


        System.out.println("Selecione a opção:\n1 - desejo criar minha marmita\n2 - desejo o plano marmitas semanais");
        Double plano = scan.nextDouble();
        if (plano == 1){
            System.out.println("Escolha a salada:\n");
            refeicao.mostrarSaladas();


        }

        
            
    }

}   

