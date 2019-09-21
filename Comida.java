import java.util.ArrayList;
//Classe Modelo
class Comida {
    Componentes tipoComida = new Componentes();
    ArrayList<ArrayList<Componentes>> listaTodasComidas;
    ArrayList<Componentes> listaPrincipais;
    ArrayList<Componentes> listaSaladas;
    ArrayList<Componentes> listaSobremesas;
    ArrayList<Componentes> listaAdicionais;
    ArrayList<Componentes> listaBebidas;
    ArrayList<Componentes> listaPedidos;

    public Comida(){
        listaTodasComidas = new ArrayList<>();
        listaPrincipais = new ArrayList<Componentes>();
        listaSaladas = new ArrayList<Componentes>();
        listaSobremesas = new ArrayList<Componentes>();
        listaAdicionais = new ArrayList<Componentes>();
        listaBebidas = new ArrayList<Componentes>();
        listaPedidos = new ArrayList<Componentes>();

        listaPrincipais.add(null);
        listaSaladas.add(null);
        listaSobremesas.add(null);
        listaAdicionais.add(null);
        listaBebidas.add(null);
        listaPedidos.add(null);
        listaTodasComidas.add(null);
        listaTodasComidas.add(listaSaladas);
        listaTodasComidas.add(listaPrincipais);
        listaTodasComidas.add(listaSobremesas);
        listaTodasComidas.add(listaAdicionais);
        listaTodasComidas.add(listaBebidas);
    }   
    public Componentes addComida(String alimento, Double valor) {
        Componentes tipoComida = new Componentes();
        tipoComida.setAlimento(alimento);
        tipoComida.setValor(valor);
        return tipoComida;
    }
    public void limparListaPedidos() {
        while(listaPedidos.size()>2){
            listaPedidos.remove(1);
        }
        listaPedidos.remove(1);
	}
    public Double somaValoresListaPedidos() {
        Double soma = 0d;
        for ( int i = 1 ; i < listaPedidos.size() ; i++) {
            Componentes variavel = new Componentes();
            variavel = listaPedidos.get(i);
            soma = soma + variavel.getValor();
        }
        return soma;
    }      
    public void mostrarListaComidas(ArrayList<Componentes> listaComidasMostrar) {
        for (int i = 1; i < listaComidasMostrar.size(); i++) {
            System.out.print(i+" - ");
            System.out.println(listaComidasMostrar.get(i));
        }
        System.out.println("\n");
    }
    
    public void toString(ArrayList<Componentes> listaComidas, int qualLista) {
        if(qualLista==1){  
            System.out.println("\tSALADAS\n");
        }else if(qualLista==2){
            System.out.println("\tPRICIPAIS\n");
        }else if(qualLista==3){
            System.out.println("\tSOBREMESAS\n");
        }else if(qualLista==4){
            System.out.println("\tADICIONAIS\n");
        }else if(qualLista==5){
            System.out.println("\tBEBIDAS\n");
        }
        System.out.println("Escolha um dos itens:\n");
        Comida acessarMetodos = new Comida();
        acessarMetodos.mostrarListaComidas(listaComidas);     
    }
	public void planoSemanal(String diaDaSemana ,int numeroSemana, String diaDeHoje) {
        System.out.println(diaDaSemana);
        ArrayList<Componentes>listaTemp = new ArrayList<Componentes>();

        for ( int i = 1 ; i < listaTodasComidas.size() ; i++) {
            if (i > 3){
                continue;
            }else{
                Componentes variavel = new Componentes();
                listaTemp = listaTodasComidas.get(i);
                variavel = listaTemp.get(numeroSemana);
                System.out.println(variavel);
                if (diaDaSemana.equals(diaDeHoje)) {
                    listaPedidos.add(variavel);
                }
            }
        }
        System.out.println("\n");
    }
}