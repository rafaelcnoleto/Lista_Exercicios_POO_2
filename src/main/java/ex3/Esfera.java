package ex3;

public class Esfera {
    private double raio;

    public Esfera(double raio) {
        if (raio < 0) {
            throw new IllegalArgumentException("Raio não pode ser negativo");
        }
        this.raio = raio;
    }

    public double calcularArea() {
        return 4 * 3.1415 * Math.pow(raio, 2);
    }

    public double calcularVolume() {
        return (4.0 / 3) * 3.1415 * Math.pow(raio, 3);
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
}

