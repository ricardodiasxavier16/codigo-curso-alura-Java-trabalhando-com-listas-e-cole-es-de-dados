import modelos.Titulo;

void main() {

    ArrayList<Integer> listaDeInteiros = new ArrayList<>();
    listaDeInteiros.add(5);
    listaDeInteiros.add(10);
    listaDeInteiros.add(7);

    Collections.sort(listaDeInteiros);

    System.out.println("Lista ordenada: " + listaDeInteiros);

    Titulo titulo1 = new Titulo("G");
    Titulo titulo2 = new Titulo("J");
    Titulo titulo3 = new Titulo("A");
    Titulo titulo4 = new Titulo("Z");

    ArrayList<Titulo> listaDeTitulos = new ArrayList<>();
    listaDeTitulos.add(titulo1);
    listaDeTitulos.add(titulo2);
    listaDeTitulos.add(titulo3);
    listaDeTitulos.add(titulo4);

    Collections.sort(listaDeTitulos);

    for (Titulo titulo : listaDeTitulos){
        System.out.println(titulo.nome);
    }

    List<String> arrayList = new ArrayList<>();
    List<String> linkedList = new LinkedList<>();

    arrayList.add("A");
    arrayList.add("B");
    arrayList.add("C");

    linkedList.add("X");
    linkedList.add("Y");
    linkedList.add("Z");

    System.out.println(arrayList);
    System.out.println(linkedList);

    linkedList = new ArrayList<>();

    linkedList.add(arrayList.getFirst());

    System.out.println(linkedList);

}