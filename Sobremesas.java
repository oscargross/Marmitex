class Sobremesas {
    private String so1;
    private Double v1;

    public void setSo1(String so1) {
        this.so1 = so1;
    }
    public String getSo1() {
        return so1;
    }    
    public void setV1(Double v1) {
        this.v1 = v1;
    }
    public Double getV1() {
        return v1;
    }
    public String toString() {
        return "R$ "+ v1 + " - " + so1;
   }
}