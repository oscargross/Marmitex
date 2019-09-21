import java.util.ArrayList;

class Cliente {
    private ArrayList<Cliente> listaClientes = new ArrayList<>();
    private String nome;
    private Integer cpf;
    private Integer fone;
    private String rua;
    private Integer cep;
    private Integer numero;
    private String bairro;
    private Double desconto = 0d;

    public void mostrarDados(Cliente clienteEncontrado) {
        System.out.println(clienteEncontrado.nome);
        System.out.println(clienteEncontrado.cpf);
        System.out.println(clienteEncontrado.fone);
        System.out.println(clienteEncontrado.rua);
        System.out.println(clienteEncontrado.numero);
        System.out.println(clienteEncontrado.cep);
        System.out.println(clienteEncontrado.bairro);
    }

    public Double getDesconto() {
        return desconto;
    }

    public void setDesconto(Double desconto) {
        this.desconto = desconto;
    }

    public Cliente verificaNomeLista(String variavelNome) {
        for (Cliente i : this.listaClientes) {
            String nomeDaLista = i.nome;
            if (variavelNome.equals(nomeDaLista)) {
                return i;
            }
        }
        return null;
    }
    public Cliente verificaFoneLista(Integer variavelFone) {
        for (Cliente i : this.listaClientes) {
            Integer nomeDaLista = i.fone;
            if (variavelFone.equals(nomeDaLista)) {
                return i;
            }
        }
        return null;
    }
    public Cliente verificaCpfLista(Integer variavelCpf) {
        for (Cliente i : this.listaClientes) {
            Integer nomeDaLista = i.cpf;
            if (variavelCpf.equals(nomeDaLista)) {
                return i;
            }
        }
        return null;
	}
    
    public void adicionarCliente(Cliente cliente) {
        this.listaClientes.add(cliente);
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Integer getFone() {
        return fone;
    }
    public void setFone(Integer fone) {
        this.fone = fone;
    }
    public Integer getCpf() {
        return cpf;
    }
    public void setCpf(Integer cpf) {
        this.cpf = cpf;
    }
    public String getRua() {
        return rua;
    }
    public String getBairro() {
        return bairro;
    }
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    public Integer getNumero() {
        return numero;
    }
    public void setNumero(Integer numero) {
        this.numero = numero;
    }
    public Integer getCep() {
        return cep;
    }
    public void setCep(Integer cep) {
        this.cep = cep;
    }
    public void setRua(String rua) {
        this.rua = rua;
    }
    public void setListaClientes(ArrayList<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }
	public ArrayList<Cliente> getListaClientes() {
        return listaClientes;
    }
}