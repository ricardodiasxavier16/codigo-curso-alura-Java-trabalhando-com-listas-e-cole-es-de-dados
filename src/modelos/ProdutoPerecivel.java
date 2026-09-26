package modelos;

public class ProdutoPerecivel extends Produto{
    private String dataDeValidade;

    public ProdutoPerecivel(String nome, double preco, int quantidade, String dataDeValidade) {
        super(nome, preco, quantidade);
        this.dataDeValidade = dataDeValidade;

    }

    @Override
    public String toString() {
        return super.nome + ": R$" + super.preco + "(Temos atualmente " + super.quantidade + " no estoque)" + " Validade: " + dataDeValidade;
    }

}
