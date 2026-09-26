import modelos.Produto;
import modelos.ProdutoPerecivel;

void main() {
    ArrayList<Produto> listaProdutos = new ArrayList<>();
    Produto produto1 = new Produto("Leite", 5, 10);
    Produto produto2 = new Produto("Macarrão", 6.5, 20);
    Produto produto3 = new Produto("Feijao", 7.8, 15);

    listaProdutos.add(produto1);
    listaProdutos.add(produto2);
    listaProdutos.add(produto3);

    System.out.println("Quantos produtos temos: " + listaProdutos.size());
    System.out.println("O primeiro produto é: " + listaProdutos.get(0));

    System.out.println(listaProdutos);

    ProdutoPerecivel produtoPerecivel1 = new ProdutoPerecivel("Carne Bovina", 15.6,20,"26/10/2026");

    System.out.println(produtoPerecivel1);


}