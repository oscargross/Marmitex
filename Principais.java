class Principais {

    private String p1;
    private Double v1;

    public void setP1(String p1) {
        this.p1 = p1;
    }
    public String getP1() {
        return p1;
    }    
    public void setV1(Double v1) {
        this.v1 = v1;
    }
    public Double getV1() {
        return v1;
    }
    public String toString() {
        return "R$ "+ v1 + " - " + p1;
   }
}
