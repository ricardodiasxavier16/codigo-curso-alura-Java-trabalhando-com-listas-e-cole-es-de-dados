import modelos.*;

void main() {

    String x = "ola!";
    String y = "tudo bem?";
    String z = "bom dia!";

    ArrayList<String> lista = new ArrayList<>();

    lista.add(x);
    lista.add(y);
    lista.add(z);

    for (String palavra : lista){
        System.out.println(palavra);
    }

    Cachorro cachorro1 = new Cachorro("Pituca");
    if (cachorro1 instanceof Cachorro){
        Animal animal = (Animal) cachorro1;
        System.out.println(animal);

    }

    Produto produto1 = new Produto("Leite", 5.6);
    Produto produto2 = new Produto("Flor", 6.5);
    Produto produto3 = new Produto("Pão", 7.4);

    ArrayList<Produto> produtos = new ArrayList<>();
    produtos.add(produto1);
    produtos.add(produto2);
    produtos.add(produto3);

   double precoTotal = 0.0;
    for (Produto produto : produtos){

        precoTotal += produto.getPreco();

    }

    double mediaDosPrecos = precoTotal/produtos.size();
    System.out.println("Media dos precos: "  + mediaDosPrecos);

    Circulo circulo = new Circulo(3.5);
    System.out.println("A área do circulo é: " + circulo.calcularArea());

    Quadrado quadrado = new Quadrado(5);
    System.out.println("A área do quadrado é: " + quadrado.calcularArea());

    ContaBancaria contaBancaria1 = new ContaBancaria(1,13000.65);
    ContaBancaria contaBancaria2 = new ContaBancaria(2,15000.50);
    ContaBancaria contaBancaria3 = new ContaBancaria(3,17000.50);
    ContaBancaria contaBancaria4 = new ContaBancaria(4,11000.15);

    ArrayList<ContaBancaria> listaContas = new ArrayList<>();

    listaContas.add(contaBancaria1);
    listaContas.add(contaBancaria2);
    listaContas.add(contaBancaria3);
    listaContas.add(contaBancaria4);

    ContaBancaria contaComMaiorValor = listaContas.getFirst();

    for (ContaBancaria contaBancaria : listaContas){
        if (contaBancaria.getSaldo() > contaComMaiorValor.getSaldo()){
            contaComMaiorValor = contaBancaria;
        }

    }
    System.out.println("A conta Bancaria com maior valor é: " + contaComMaiorValor);
    
}