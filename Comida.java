import java.util.ArrayList;

class Comida {
    ArrayList<Principais> listaPrincipais;
    ArrayList<Saladas> listaSaladas;
    ArrayList<Sobremesas> listaSobremesas;
    ArrayList<Adicionais> listaAdicionais;
    ArrayList<Bebidas> listaBebidas;
    public Comida(){
        listaPrincipais = new ArrayList<>();
        listaSaladas = new ArrayList<>();
        listaSobremesas = new ArrayList<>();
        listaAdicionais = new ArrayList<>();
    }   
    public void addPrincipais(String alimento, Double valor){
        Principais principal = new Principais();
        principal.setP1(alimento);
        principal.setV1(valor);
        listaPrincipais.add(principal);
    }
    public void addSaladas(String alimento, Double valor){
        Saladas salada = new Saladas();
        salada.setS1(alimento);
        salada.setV1(valor);
        listaSaladas.add(salada);
    }
    public void addSobremesas(String alimento, Double valor){
        Sobremesas sobremesa = new Sobremesas();
        sobremesa.setSo1(alimento);
        sobremesa.setV1(valor);
        listaSobremesas.add(sobremesa);
    }
    public void addAdicionais(String alimento, Double valor){
        Adicionais adicional = new Adicionais();
        adicional.setA1(alimento);
        adicional.setV1(valor);
        listaAdicionais.add(adicional);
    }
    public void addBebidas(String alimento, Double valor){
        Bebidas bebida = new Bebidas();
        adicional.setB1(alimento);
        adicional.setV1(valor);
        listaBebidas.add(bebida);
    }

    public void mostrarPrincipais() {
        for (int i = 0; i < listaPrincipais.size(); i++) {
            System.out.println(listaPrincipais.get(i));
        }
        System.out.println("\n");
    }
    public void mostrarSaladas() {
        for (int i = 0; i < listaSaladas.size(); i++) {
            System.out.println(listaSaladas.get(i));
        }
        System.out.println("\n");
    }  
    public void mostrarSobremesas() {
        for (int i = 0; i < listaSobremesas.size(); i++) {
            System.out.println(listaSobremesas.get(i));
        }
        System.out.println("\n");
    }    
    public void mostrarAdicionais() {
        for (int i = 0; i < listaAdicionais.size(); i++) {
            System.out.println(listaAdicionais.get(i));
        }
        System.out.println("\n");
    }
    public void mostrarBebidas() {
        for (int i = 0; i < listaBebidas.size(); i++) {
            System.out.println(listaBebidas.get(i));
        }
        System.out.println("\n");   
}