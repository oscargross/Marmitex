import java.util.ArrayList;

class Comida {


    ArrayList<ArrayList> todasComidas = new ArrayList();
    ArrayList<Componentes> principais = new ArrayList();
    ArrayList<Componentes> saladas = new ArrayList();
    ArrayList<Componentes> sobremesas = new ArrayList();
    ArrayList<Componentes> adicionais = new ArrayList();
    ArrayList<Componentes> bebidas = new ArrayList();

    // public Comida(){
    //     listaTodasComidas = new ArrayList<>();
    //     listaPrincipais = new ArrayList<Componentes>();
    //     listaSaladas = new ArrayList<Componentes>();
    //     listaSobremesas = new ArrayList<Componentes>();
    //     listaAdicionais = new ArrayList<Componentes>();
    //     listaBebidas = new ArrayList<Componentes>();
    //     // listaPrincipais.add(null);
    //     // listaSaladas.add(null);
    //     // listaSobremesas.add(null);
    //     // listaAdicionais.add(null);
    //     // listaBebidas.add(null);

    //     // listaTodasComidas.add(null);
    //     listaTodasComidas.add(listaSaladas);
    //     listaTodasComidas.add(listaPrincipais);
    //     listaTodasComidas.add(listaAdicionais);
    //     listaTodasComidas.add(listaSobremesas);
    //     listaTodasComidas.add(listaBebidas);

    // }   
    public void addComida(String alimento, Double valor, String tipo) {
        Componentes tipoComida = new Componentes();
        switch (tipo) {
            case "principais":
                tipoComida.setAlimento(alimento);
                tipoComida.setValor(valor);
                principais.add(tipoComida);
                todasComidas.add(principais);
                break;
            case "saladas":
                tipoComida.setAlimento(alimento);
                tipoComida.setValor(valor);
                saladas.add(tipoComida);
                todasComidas.add(saladas);
                break;
            case "sobremesas":
                tipoComida.setAlimento(alimento);
                tipoComida.setValor(valor);
                sobremesas.add(tipoComida);
                todasComidas.add(sobremesas);
                break;
            case "adicionais":
                tipoComida.setAlimento(alimento);
                tipoComida.setValor(valor);
                adicionais.add(tipoComida);
                todasComidas.add(adicionais);
                break;
            case "bebidas":
                tipoComida.setAlimento(alimento);
                tipoComida.setValor(valor);
                bebidas.add(tipoComida);
                todasComidas.add(bebidas);
                break;    
        }
        
    }

    public void mostrarListaComidas(ArrayList<Componentes> listaComidasMostrar) {
        listaComidasMostrar = new ArrayList<Componentes>();

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
