class DadosCliente {
    private String nome;
    private Integer cpf;
    private Integer fone;
    private String rua;
    private Integer cep;
    private Integer numero;
    private String bairro;

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
}