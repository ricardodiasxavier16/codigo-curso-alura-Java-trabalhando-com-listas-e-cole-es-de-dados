package modelos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Cartao {
    String titular;
    int numero;
    int csv;
    double creditoTotal;
    double creditoAtual;
    public List<Compra> compras = new ArrayList<>();

    public Cartao(String titular, int numero, int csv, double creditoTotal) {
        this.titular = titular;
        this.numero = numero;
        this.csv = csv;
        this.creditoTotal = creditoTotal;
    }

    @Override
    public String toString() {
        return "Titular: " + titular +"\nNumero do cartão: " + numero + "\nCódigo de Segurança: " + csv +
                "\nCrédito: " + creditoTotal;
    }

    public void comprarNoCartao(){
        int numero = 1;
        int contador = 0;
        Scanner leitura = new Scanner(System.in);
        while (numero != 0){
            contador += 1;
            System.out.println("Digite a descrição da compra: ");
            String descricao = leitura.next();
            System.out.println("Digite o valor da compra: ");
            double valorDaCompra = leitura.nextDouble();
            if (creditoAtual + valorDaCompra > creditoTotal){
                System.out.println("Valor da compra excede o crédito");
            } else {
                this.creditoAtual += valorDaCompra;

                Compra compra = new Compra(descricao, valorDaCompra);
                compras.add(compra);

            }

            System.out.println("Digite 0 para para ou 1 para continuar");
            numero = leitura.nextInt();

        }

        Collections.sort(compras);
        System.out.println(compras);

    }

}
