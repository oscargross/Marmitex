import java.util.Scanner;

class DadosCliente {
    private String nome;
    private Integer cpf;
    private Integer fone;
    private String rua;
    private String cep;
    private Integer numero;
    private String bairro;
    private Endereco endereco;

  

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getNome() {
        return nome;
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
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRua() {
        return rua;
    }
    public Endereco getEndereco() {
        return endereco;
    }
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
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
    public String getCep() {
        return cep;
    }
    public void setCep(String cep) {
        this.cep = cep;
    }
    public void setRua(String rua) {
        this.rua = rua;
    }
}