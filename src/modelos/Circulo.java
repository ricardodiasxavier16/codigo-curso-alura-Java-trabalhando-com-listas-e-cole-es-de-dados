package modelos;

import calculo.Forma;

public class Circulo implements Forma {
    double raio;

    public Circulo(double raio){
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return 3.14 * raio * raio;
    }
}
