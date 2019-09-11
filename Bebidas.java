class Bebidas {

    private String b1;
    private Double v1;

    public void setS1(String b1) {
        this.b1 = b1;
    }
    public String getS1() {
        return b1;
    }    
    public Double getV1() {
        return v1;
    }
    public String toString() {
        return "R$ "+ v1 + " - " + b1;
    }
	public void setV1(Double v1) {
        this.v1 = v1;
    }
}