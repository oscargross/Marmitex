class Componentes {

    private String alimento;
    private Double valor;

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }
    public String getAlimento() {
        return alimento;
    }    
    public void setValor(Double valor) {
        this.valor = valor;
    }
    public Double getValor() {
        return valor;
    }
    public String toString() {
        return "R$ "+ valor + " - " + alimento;
   }
	public char[] get(int i) {
		return null;
	}
}
