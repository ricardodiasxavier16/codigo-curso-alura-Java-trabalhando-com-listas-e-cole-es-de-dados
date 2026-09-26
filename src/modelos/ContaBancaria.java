package modelos;

public class ContaBancaria {
    private int numeroDaConta;
    private double saldo;

    public ContaBancaria(int numeroDaConta, double saldo){
        this.numeroDaConta = numeroDaConta;
        this.saldo = saldo;

    }

    @Override
    public String toString() {
        return "Conta número: " + numeroDaConta + "(Saldo: " + saldo + ")";
    }

    public double getSaldo() {
        return saldo;
    }
}
