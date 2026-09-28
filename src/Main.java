import modelos.Cartao;

void main() {

    Scanner leitura = new Scanner(System.in);
    System.out.println("Digite o seu nome: ");
    String nome = leitura.next();
    System.out.println("Digite o crédito desejado para o seu cartãoo: ");
    double credito = leitura.nextDouble();

    Cartao cartao = new Cartao(nome,445, 456, credito);

    System.out.println("Cartão criado!!!\nInformações do Cartão: " + cartao);

    cartao.comprarNoCartao();





}