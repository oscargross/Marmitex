import java.util.ArrayList;
import java.util.Scanner;
//Classe de Sistema
class Marmita {

    public static void main(String[] args) {
        Comida refeicao = new Comida();
        ArrayList<Componentes> saladas = refeicao.listaSaladas;
        ArrayList<Componentes> principais = refeicao.listaPrincipais;
        ArrayList<Componentes> adicionais = refeicao.listaAdicionais;
        ArrayList<Componentes> sobremesas = refeicao.listaSobremesas;
        ArrayList<Componentes> bebidas = refeicao.listaBebidas;
        saladas = new ArrayList<Componentes>();
        principais = new ArrayList<Componentes>();
        adicionais = new ArrayList<Componentes>();
        sobremesas = new ArrayList<Componentes>();
        bebidas = new ArrayList<Componentes>();

        //Adicionar Saladas ao menu.
        saladas.add(refeicao.addComida("Alface", 1.00));
        saladas.add(refeicao.addComida("Tomate", 1.20));
        saladas.add(refeicao.addComida("Couve-Flor", 1.40));
        saladas.add(refeicao.addComida("rucula", 1.20));
        saladas.add(refeicao.addComida("Cenoura e Beterraba", 1.30));
        saladas.add(refeicao.addComida("Cenoura e Beterraba", 1.30));
        
        //Adicionar Pratos Principais ao menu
        principais.add(refeicao.addComida("Arroz, Feijão e batata frita", 5.50));
        principais.add(refeicao.addComida("Massa com molho de galinha", 6.50));
        principais.add(refeicao.addComida("Panquecas", 7.00));
        principais.add(refeicao.addComida("Arroz com galinha", 4.50));
        principais.add(refeicao.addComida("Lasanha 4 queijos", 7.00));
        principais.add(refeicao.addComida("Purê e guizado", 6.50));
        principais.add(refeicao.addComida("Churrasco e maioneses", 7.50));

        //Adicionar Adicionais ao menu
        adicionais.add(refeicao.addComida("Carne de porco", 1.7));
        adicionais.add(refeicao.addComida("Carne de gado", 1.8));
        adicionais.add(refeicao.addComida("Carne de frango", 1.6));
        adicionais.add(refeicao.addComida("Queijo - feito na chapa", 1.3));
         
        //Adicionar Sobremesas ao menu
        sobremesas.add(refeicao.addComida("sagu", 0.9));
        sobremesas.add(refeicao.addComida("Torta de bolacha", 2.00));
        sobremesas.add(refeicao.addComida("Ambrosia", 1.0));
        sobremesas.add(refeicao.addComida("Pudim", 1.80));
        sobremesas.add(refeicao.addComida("Mousse de maracujá", 1.5));
        
        //Adicionar Bebidas ao menu
        bebidas.add(refeicao.addComida("Coca Cola", 5.0));
        bebidas.add(refeicao.addComida("Pepsi", 4.5)); 
        bebidas.add(refeicao.addComida("Suco de Laranja", 4.00));
        bebidas.add(refeicao.addComida("Suco de Uva", 4.00));
        bebidas.add(refeicao.addComida("Agua", 2.0));
        refeicao.mostrarListaComidas(sobremesas);
        refeicao.mostrarListaComidas(bebidas);
        refeicao.mostrarListaComidas(sobremesas);


        Scanner scan = new Scanner(System.in);//seção critica é a parte do codigo que pode ser acessada opr 2 processos ao mesmo tempo
        Marmita funcaoCliente = new Marmita();
        funcaoCliente.cadastro();
        System.out.println("Selecione a opção:\n1 - desejo criar minha marmita\t2 - desejo o plano marmitas semanais");
        Double plano = scan.nextDouble();
        if (plano == 1){
            funcaoCliente.inserirItens(refeicao);
        }

 
    }
    public void cadastro(){
        Scanner scan = new Scanner(System.in);//seção critica é a parte do codigo que pode ser acessada opr 2 processos ao mesmo tempo
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
    public void inserirItens(Comida refeicao) {
        Scanner scan = new Scanner(System.in);//seção critica é a parte do codigo que pode ser acessada opr 2 processos ao mesmo tempo
        
        ArrayList<Componentes> listaPedidos = new ArrayList<Componentes>();
        ArrayList<Componentes> listaTemp = new ArrayList<Componentes>();
       

        int qualLista = 1;
        while (true){
            listaTemp = ((ArrayList<Componentes>) refeicao.listaTodasComidas.get(qualLista));
            refeicao.toString(listaTemp, qualLista);
            int opcao = scan.nextInt(); 
            for ( int i = 0; i < listaTemp.size(); i++) {
                if (opcao == i){
                    Componentes variavel = listaTemp.get(i);
                    listaPedidos.add(variavel);
                    break;
                }
            }

            System.out.println(listaPedidos);

            System.out.println("Deseja escolher mais algum item:\n1: Sim\t2 - Nâo");
            Double maisItens = scan.nextDouble();
            if (maisItens == 1){
                continue;
            }else{
                qualLista++;
                
            }
        } 
        
    }
}   

