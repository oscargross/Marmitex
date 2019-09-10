class Saladas {

    private String s1;
    private Double v1;

    public void setS1(String s1) {
        this.s1 = s1;
    }
    public String getS1() {
        return s1;
    }    
    public Double getV1() {
        return v1;
    }
    public String toString() {
        return "R$ "+ v1 + " - " + s1;
    }
	public void setV1(Double v1) {
        this.v1 = v1;
    }
}