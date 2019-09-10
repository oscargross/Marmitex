import java.util.ArrayList;
import java.util.Scanner;

class Cliente {
    Endereco endereco = new Endereco();
    
    private ArrayList<String> historicoPedidos = new ArrayList<>();
    private ArrayList<String> listaClientes = new ArrayList<>();   

	public boolean verificaLista(String nome_1) {
        for (String i : this.listaClientes){
            if (nome_1.equals(i)){
                return true;
            }
        }
        return false;
	}
/*
	public void cadastrarCliente(String nome_1) {
        Scanner scan = new Scanner(System.in);
        listaClientes.add(nome_1);
        setNome(nome_1);

        System.out.println("Digite seu CPF: ");
        Integer cpf_1 = scan.nextInt();
        setCpf(cpf_1);

        System.out.println("Digite seu telefone: ");
        Integer fone_1 = scan.nextInt();
        setFone(fone_1);

    }*/

}