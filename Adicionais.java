class Adicionais {
    private String a1;
    private Double v1;

    public void setA1(String a1) {
        this.a1 = a1;
    }
    public String getA1() {
        return a1;
    }    
    public void setV1(Double v1) {
        this.v1 = v1;
    }
    public Double getV1() {
        return v1;
    }
    public String toString() {
        return "R$ "+ v1 + " - " + a1;
   }   
}