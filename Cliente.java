import java.util.ArrayList;
import java.util.Scanner;

class Cliente {
    DadosCliente dados = new DadosCliente();

    private ArrayList<String> historicoPedidos = new ArrayList<>();
    private ArrayList<String> listaClientes = new ArrayList<>();

    public boolean verificaLista(String nome_1) {
        for (String i : this.listaClientes) {
            if (nome_1.equals(i)) {
                return true;
            }
        }
        return false;
    }
    public ArrayList<String> getHistoricoPedidos() {
        return historicoPedidos;
    }

    public void setHistoricoPedidos(ArrayList<String> historicoPedidos) {
        this.historicoPedidos = historicoPedidos;
    }
    public ArrayList<String> getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(ArrayList<String> listaClientes) {
        this.listaClientes = listaClientes;
    }

}