import java.util.ArrayList;
import java.util.Scanner;

//Classe de Sistema
class Marmita {
    Scanner scan = new Scanner(System.in);//seção critica é a parte do codigo que pode ser acessada opr 2 processos ao mesmo tempo
        String diaDeHoje = "Segunda"; 

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);//seção critica é a parte do codigo que pode ser acessada opr 2 processos ao mesmo tempo
        Comida refeicao = new Comida();
        Marmita marmita = new Marmita();

        //Adicionar Saladas ao menu.
        /*SEGUNDA - PLANO SEMANAL*/ refeicao.listaSaladas.add(refeicao.addComida("Alface", 1.00));
        /*TERÇA   - PLANO SEMANAL*/ refeicao.listaSaladas.add(refeicao.addComida("Tomate", 1.20));
        /*QUARTA  - PLANO SEMANAL*/ refeicao.listaSaladas.add(refeicao.addComida("Couve-Flor", 1.40));
        /*QUINTA  - PLANO SEMANAL*/ refeicao.listaSaladas.add(refeicao.addComida("rucula", 1.20));
        /*SEXTA   - PLANO SEMANAL*/ refeicao.listaSaladas.add(refeicao.addComida("Cenoura e Beterraba", 1.30));
        /*SABADO  - PLANO SEMANAL*/ refeicao.listaSaladas.add(refeicao.addComida("Rabanete", 1.00));
        
        //Adicionar Pratos Principais ao menu
        /*SEGUNDA - PLANO SEMANAL*/refeicao.listaPrincipais.add(refeicao.addComida("Arroz, Feijão e batata frita", 5.50));
        /*TERÇA   - PLANO SEMANAL*/refeicao.listaPrincipais.add(refeicao.addComida("Massa com molho de galinha", 6.50));
        /*QUARTA  - PLANO SEMANAL*/refeicao.listaPrincipais.add(refeicao.addComida("Panquecas", 7.00));
        /*QUINTA  - PLANO SEMANAL*/refeicao.listaPrincipais.add(refeicao.addComida("Arroz com galinha", 4.50));
        /*SEXTA   - PLANO SEMANAL*/refeicao.listaPrincipais.add(refeicao.addComida("Lasanha 4 queijos", 7.00));
        /*SABADO  - PLANO SEMANAL*/refeicao.listaPrincipais.add(refeicao.addComida("Churrasco e maioneses", 7.50));

        //Adicionar Sobremesas ao menu 
        /*SEGUNDA - PLANO SEMANAL*/refeicao.listaSobremesas.add(refeicao.addComida("sagu", 0.9));
        /*TERÇA   - PLANO SEMANAL*/refeicao.listaSobremesas.add(refeicao.addComida("Torta de bolacha", 2.00));
        /*QUARTA  - PLANO SEMANAL*/refeicao.listaSobremesas.add(refeicao.addComida("Ambrosia", 1.0));
        /*QUINTA  - PLANO SEMANAL*/refeicao.listaSobremesas.add(refeicao.addComida("Pudim", 1.80));
        /*SEXTA   - PLANO SEMANAL*/refeicao.listaSobremesas.add(refeicao.addComida("Mousse de maracujá", 1.5));
        /*SABADO  - PLANO SEMANAL*/refeicao.listaSobremesas.add(refeicao.addComida("Mousse de chocolate", 1.5));

        //Adicionar Adicionais ao menu
        refeicao.listaAdicionais.add(refeicao.addComida("Carne de porco", 1.7));
        refeicao.listaAdicionais.add(refeicao.addComida("Carne de gado", 1.8));
        refeicao.listaAdicionais.add(refeicao.addComida("Carne de frango", 1.6));
        refeicao.listaAdicionais.add(refeicao.addComida("Queijo - feito na chapa", 1.3));
        refeicao.listaAdicionais.add(refeicao.addComida("Ploenta frita", 1.3));
        refeicao.listaAdicionais.add(refeicao.addComida("Almondegas", 1.3));

        //Adicionar Bebidas ao menu
        refeicao.listaBebidas.add(refeicao.addComida("Coca Cola", 5.0));
        refeicao.listaBebidas.add(refeicao.addComida("Pepsi", 4.5)); 
        refeicao.listaBebidas.add(refeicao.addComida("Suco de Laranja", 4.00));
        refeicao.listaBebidas.add(refeicao.addComida("Suco de Uva", 4.00));
        refeicao.listaBebidas.add(refeicao.addComida("Agua", 2.0));
        Cliente cliente = new Cliente();

        while(true){
            cliente.adicionarCliente(marmita.cadastro(marmita, cliente));
            System.out.println("Cadastro concluido com sucesso");

            System.out.println("Selecione a opção:\n1 - desejo criar minha marmita\t2 - desejo o plano marmitas semanais");
            Double plano = scan.nextDouble();
            if (plano == 1){
                marmita.inserirItens(cliente, refeicao, marmita, 1);
            }else{            
                marmita.planoSemanal(refeicao, marmita);
                marmita.inserirItens(cliente, refeicao, marmita, 4);


            }
        }
    
    }
    
    private void planoSemanal(Comida refeicao, Marmita marmita) {
        System.out.println("Segue cardapio por dia da semana:\n");
        refeicao.planoSemanal("Segunda",1, diaDeHoje);
        refeicao.planoSemanal("Terca",2, diaDeHoje);
        refeicao.planoSemanal("Quarta",3, diaDeHoje);
        refeicao.planoSemanal("Quinta",4, diaDeHoje);
        refeicao.planoSemanal("Sexta",5, diaDeHoje);
        refeicao.planoSemanal("Sabado",6, diaDeHoje);
        System.out.println("O plano semanal não possui Adiocionais, nem bebidas, segue lista caso queira adicionar:\n");


    }

    public Cliente cadastro(Marmita marmita, Cliente cliente) {
        while (true){
            System.out.println("Bem vindo ao Sistema Marmitex PF\nPreencha os dados a seguir para completar o cadastro: ");
            System.out.println("Qual o seu nome: ");
            String variavelNome = scan.next();
            if (cliente.verificaNomeLista(variavelNome)==null){
                cliente.setNome(variavelNome); 
                System.out.println("Qual o seu cpf: ");
                Integer variavelCpf = scan.nextInt();
                if (cliente.verificaCpfLista(variavelCpf)==null){
                    cliente.setCpf(variavelCpf); 
                    System.out.println("Qual o seu fone: ");
                    Integer variavelFone = scan.nextInt();
                    if (cliente.verificaFoneLista(variavelFone)==null){
                        cliente.setFone(variavelFone); 
                        System.out.println("Qual a sua rua: ");
                        cliente.setRua(scan.next()); 
                        System.out.println("Qual o numero de seu endereço: ");
                        cliente.setNumero(scan.nextInt()); 
                        System.out.println("Qual a seu CEP: ");
                        cliente.setCep(scan.nextInt()); 
                        System.out.println("Qual a seu Bairro: ");
                        cliente.setBairro(scan.next());
                        return cliente;
                        
                    }else{
                        if (!marmita.jaTemCadastro(cliente.verificaFoneLista(variavelFone))){
                            System.out.println("Faça o cadastro novamente inserindo um telefone diferente:\n\n");
                            continue;
                        }else{
                            return cliente.verificaFoneLista(variavelFone);
                        }                        
                    }
                }else{
                    if(marmita.jaTemCadastro(cliente.verificaCpfLista(variavelCpf))){
                        System.out.println("Faça o cadastro novamente inserindo CPF diferente:\n\n");
                        continue;
                    }else{
                        return cliente.verificaCpfLista(variavelCpf);
                    } 
                }
            }else{
                if(marmita.jaTemCadastro(cliente.verificaNomeLista(variavelNome))){
                    System.out.println("Faça o cadastro novamente inserindo um Nome diferente:\n\n");
                    continue;
                }else{
                    return cliente.verificaNomeLista(variavelNome);
                } 

            
            }
        }
    }
    public boolean jaTemCadastro(Cliente clienteEncontrado) {
        System.out.println("Você já possui cadastro");
        clienteEncontrado.mostrarDados(clienteEncontrado);
        System.out.println("\nEste é seu cadastro?\n1 - Sim\t2 - Não");
        int opcao = scan.nextInt(); 
        if (opcao == 1){
            return false;
        }else{
            return true;
        }
    }

    public Boolean inserirItens(Cliente cliente, Comida refeicao, Marmita marmita, int qualLista) {
        ArrayList<Componentes> listaTemp = new ArrayList<Componentes>();
        while (refeicao.listaTodasComidas.size() > qualLista){
            listaTemp = (refeicao.listaTodasComidas.get(qualLista));
            refeicao.toString(listaTemp, qualLista);
            int opcao = scan.nextInt(); 
            for ( int i = 0; i < listaTemp.size(); i++) {
                if (opcao == i){
                    refeicao.listaPedidos.add(listaTemp.get(i));
                    break;
                }
            }
            System.out.println(refeicao.listaPedidos);
            System.out.println("Deseja escolher mais algum item:\n1: Sim\t2 - Nâo");
            Double maisItens = scan.nextDouble();
            if (maisItens == 1){
                continue;
            }else{
                qualLista++;
            }
        } 
        System.out.println("Sua marmita esta pronta:");
        System.out.println("Essa é sua Marmita:");
        refeicao.mostrarListaComidas(refeicao.listaPedidos);
        cliente.adicionarHistorico(refeicao.listaPedidos);
        System.out.println("Seguem seus Dados:\n");
        cliente.mostrarDados(cliente);
        System.out.println("\nValor Total: R$ "+refeicao.somaValoresListaPedidos()+"\nA Tele de R$ 8,00 será cobrada na entrega\n\nnGostaria de fazer mais um pedido:\n1 - Sim\t2 - Nâo");
        Double retornar = scan.nextDouble();
        if (retornar == 1){
            return false;
        }else{
            return true;
        }

    }
   
}   

