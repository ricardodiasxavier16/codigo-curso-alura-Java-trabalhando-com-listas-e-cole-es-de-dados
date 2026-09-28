package modelos;

public class Compra implements Comparable<Compra>{
    public String descricao;
    public double valorDaCompra;

    public Compra(String descricao, double valorDaCompra){
        this.descricao = descricao;
        this.valorDaCompra = valorDaCompra;

    }

    @Override
    public String toString() {
        return descricao + " - R$" + valorDaCompra;
    }

    @Override
    public int compareTo(Compra outraCompra) {
        return Double.compare(this.valorDaCompra, outraCompra.valorDaCompra);
    }
}
