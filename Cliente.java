import java.util.ArrayList;

class Cliente {
    DadosCliente dados = new DadosCliente();
    private ArrayList<String> historicoPedidos = new ArrayList<>();
    private ArrayList<Cliente> listaClientes = new ArrayList<>();
    

    public boolean verificaLista(String nome_1) {
        for (Cliente i : this.listaClientes) {
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
    public ArrayList<Cliente> getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(ArrayList<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }
	public void adicionarCliente(Cliente cliente) {
        this.listaClientes.add(cliente);

    }

}