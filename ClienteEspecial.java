
class ClienteEspecial extends Cliente {
    private Double desconto;
    
    public Double getDesconto() {
        return desconto;
    }
    public void setDesconto(Double desconto) {
        this.desconto = desconto;
    }
	public void cadastroEspecial(String nome, Integer cpf, Integer fone, String rua, Integer cep, Integer numero,
        String bairro) {
        this.setNome(nome); 
        this.setCpf(cpf);
        this.setFone(fone);
        this.setRua(rua);
        this.setCep(cep);
        this.setNumero(numero);
        this.setBairro(bairro);
        this.setDesconto(desconto);
	}
}  