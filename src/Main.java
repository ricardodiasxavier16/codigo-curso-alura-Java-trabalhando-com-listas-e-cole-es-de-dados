import objetos.Pessoa;

void main() {
    ArrayList<Pessoa> listaDePessoas = new ArrayList<>();

    Pessoa pessoa1 = new Pessoa();
    pessoa1.setNome("Ricardo");
    pessoa1.setIdade(22);

    Pessoa pessoa2 = new Pessoa();
    pessoa2.setNome("Caio");
    pessoa2.setIdade(22);

    Pessoa pessoa3 = new Pessoa();
    pessoa3.setNome("Lenio");
    pessoa3.setIdade(23);

    listaDePessoas.add(pessoa1);
    listaDePessoas.add(pessoa2);
    listaDePessoas.add(pessoa3);

    System.out.println("Tamanho da lista: " + listaDePessoas.size());
    System.out.println("Primeira Pessoa da lista: "  + listaDePessoas.getFirst());
    System.out.println("Lista de Todas as Pessoas: ");
    for (Pessoa p : listaDePessoas){
        System.out.println(p);

    }

}