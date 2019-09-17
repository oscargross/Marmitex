import java.util.ArrayList;
//Classe Modelo
class Comida {
    ArrayList<ArrayList<Componentes>> listaTodasComidas;
    ArrayList<Componentes> listaPrincipais;
    ArrayList<Componentes> listaSaladas;
    ArrayList<Componentes> listaSobremesas;
    ArrayList<Componentes> listaAdicionais;
    ArrayList<Componentes> listaBebidas;

    public Comida(){
        listaTodasComidas = new ArrayList<>();
        listaPrincipais = new ArrayList<Componentes>();
        listaSaladas = new ArrayList<Componentes>();
        listaSobremesas = new ArrayList<Componentes>();
        listaAdicionais = new ArrayList<Componentes>();
        listaBebidas = new ArrayList<Componentes>();
        listaPrincipais.add(null);
        listaSaladas.add(null);
        listaSobremesas.add(null);
        listaAdicionais.add(null);
        listaBebidas.add(null);

        listaTodasComidas.add(null);
        listaTodasComidas.add(listaSaladas);
        listaTodasComidas.add(listaPrincipais);
        listaTodasComidas.add(listaAdicionais);
        listaTodasComidas.add(listaSobremesas);
        listaTodasComidas.add(listaBebidas);

    }   
    public Componentes addComida(String alimento, Double valor) {
        Componentes tipoComida = new Componentes();
        tipoComida.setAlimento(alimento);
        tipoComida.setValor(valor);
        return tipoComida;
    }
    public void mostrarListaComidas(ArrayList<Componentes> listaComidasMostrar) {
        for (int i = 1; i < listaComidasMostrar.size(); i++) {
            System.out.print(i+" - ");
            System.out.println(listaComidasMostrar.get(i));
        }
        System.out.println("\n");
    }
    
    public void toString(ArrayList<Componentes> listaComidas, int qualLista) {
        listaComidas = new ArrayList<Componentes>();
        if(qualLista==1){  
            System.out.println("SALADAS\n");
        }else if(qualLista==2){
            System.out.println("PRICIPAIS\n");
        }else if(qualLista==3){
            System.out.println("ADICIONAIS\n");
        }else if(qualLista==2){
            System.out.println("SOBREMESAS\n");
        }else if(qualLista==2){
            System.out.println("BEBIDAS\n");
        }
        System.out.println("Escolha um dos itens:\n");
        System.out.println(listaComidas);

        for (int i = 1; i < (listaComidas.size()); i++) {
            System.out.print(i+" - ");
            System.out.println(listaComidas.get(i));
        }
        System.out.println("\n");         
    }
  


}
